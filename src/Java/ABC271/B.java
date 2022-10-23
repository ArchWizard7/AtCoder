package Java.ABC271;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class B {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = (int) sc.nextLong();
        int Q = (int) sc.nextLong();
        Map<String, Integer> map = new HashMap<>();
        int[] s = new int[Q];
        int[] t = new int[Q];

        for (int i = 1; i <= N; i++) {
            int L = (int) sc.nextLong();

            for (int j = 1; j <= L; j++) {
                int a = (int) sc.nextLong();
                map.put((i + "," + j), a);
            }
        }

        for (int i = 0; i < Q; i++) {
            s[i] = (int) sc.nextLong();
            t[i] = (int) sc.nextLong();
        }

        for (int i = 0; i < Q; i++)
            System.out.println(map.get(s[i] + "," + t[i]));
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufLen = 0;
    private boolean hasNextByte() {
        if (ptr < bufLen) {
            return true;
        }else{
            ptr = 0;
            try {
                bufLen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bufLen > 0;
        }
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 > c || c > 126;}
    private void skipUnprintable() { while(hasNextByte() && isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return !hasNextByte();}

    public long nextLong() {
        if (hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}