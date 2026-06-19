let x: boolean | "hello" | "hi";

x = true;

x = false;

x = "hello";

x = "hi";

x = "world";

x = 500;

let y: number & string; // 'always inferred'
