//1st
class Solution {
    public long sum(int price, int count) {
        return (long)price * ((long)count * ((long)count + 1)) / 2;
    }
    public long solution(int price, int money, int count) {
        long balance = (long)money - sum(price, count);
        return balance < 0 ? -1 * balance : 0;
    }
}

//2nd
class Solution {
    public long solution(long price, long money, long count) {
        long balance = money - price * (count * (count + 1)) / 2;
        return balance < 0 ? -1 * balance : 0;
    }
}