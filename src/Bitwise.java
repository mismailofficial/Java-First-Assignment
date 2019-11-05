class Bitwise {
    public static void main(String[] args) {

        // Bitwise OR ( | )
        System.out.println(10 | 5); // 1010 OR 0101 = 1111

        // Bitwise AND ( & )
        System.out.println(10 & 5); // 1010 AND 0101 = 0000

        // Bitwise XOR ( ^ )
        System.out.println(15 ^ 5); // 1111 XOR 0101 = 1010

        // Complement ( ~ )
        System.out.println(~11); // One's Complement of 1011 is 0100

        // Left Shift Operator ( << )
        System.out.println(5 << 2); // 1010 shifted 2 times on left 101000 (5x2^2 = 20)

        // Signed Right Shift Operator ( >> )
        System.out.println(12 >> 2); // 1100 shifted 2 times on rigt 11 (5/2^2 = 3)
        System.out.println(-12 >> 2);

        // Unsigned Right Shift Operator ( <<< )
        System.out.println(12 >>> 2);
        System.out.println(-12 >>> 2);
    }
}
