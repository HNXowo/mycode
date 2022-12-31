public class fenshu {
    public static void main(String[] args) {
        Fraction a = new Fraction(7, 32);
        Fraction b = new Fraction(13, 32);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.division(b));
    }

    public static class Fraction {
        private long Num;
        private long Dem;

        public Fraction(long numerator, long denominator) {
            this.Num = numerator;
            this.Dem = denominator;
            change();
        }
        public Fraction() {
            this(0, 1);
        }
        public long getNumerator() {
            return Num;
        }
        public void setNumerator(long numerator) {
            Num= numerator;
        }
        public long getDenominator() {
            return Dem;
        }
        public void setDenominator(long denominator) {
            Dem = denominator;
        }
        private Fraction change() {
            long gcd = this.gcd(this.Num, this.Dem);
            this.Num/= gcd;
            this.Dem /= gcd;
            return this;
        }
        private long gcd(long a, long b) {
            long mod = a % b;
            if (mod == 0) {
                return b;
            } else {
                return gcd(b, mod);
            }
        }
        public Fraction add(Fraction second) {
            return new Fraction(this.Num* second.Dem + second.Num* this.Dem,
                    this.Dem * second.Dem);
        }
        public Fraction sub(Fraction second) {
            return new Fraction(this.Num* second.Dem - second.Num* this.Dem,
                    this.Dem * second.Dem);
        }
        public Fraction multiply(Fraction second) {
            return new Fraction(this.Num* second.Num,
                    this.Dem * second.Dem);
        }
        public Fraction division(Fraction second){
            return new Fraction(this.Num/second.Num,
                    this.Dem/second.Dem);
        }
        public String toString() {
            return String.format("%d/%d", this.Num, this.Dem);
        }
    }
}