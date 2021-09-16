function solution(price, money, count) {
    var balance = money - price * (count * (count + 1)) / 2;
    return balance < 0 ? -balance : 0;

}