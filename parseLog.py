### Func to parse file:
from concurrent.futures import ThreadPoolExecutor

def write_to_file(title, content, ext):
    with open(f"{title}.{ext}", 'w') as f:
        f.write(content.replace("#", "//", 1) if ext == "java" else content)

def determine_language(content):
    return "py" if "class Solution(object):" in content else "java" if "class Solution {" in content else "unknown"

def process_buffer(buffer):
    ext = determine_language("".join(buffer))
    title = buffer[0].split(" - ")[1].strip()
    if ext != "unknown":
        write_to_file(title, "".join(buffer), ext)

def main():
    with open("practiceLog.txt", 'r') as f:
        lines, buffer = f.readlines(), []
    
    with ThreadPoolExecutor() as executor:
        for line in lines:
            if line.startswith("#"):
                if buffer:
                    executor.submit(process_buffer, buffer)
                buffer = [line]
            else:
                buffer.append(line)

        if buffer:
            executor.submit(process_buffer, buffer)

if __name__ == "__main__":
    main()