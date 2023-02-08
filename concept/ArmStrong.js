let armstrong = 153;
let n = armstrong;
let count = 0;
while (n > 0) {
    // count=count*10+(~~(n%10));
    n = ~~(n / 10);
    count++;
}

let sum = 0;
let total = 1;
while (armstrong > 0) {
    let last = armstrong % 10;
    //    let m=count;
    //    while(m-- >0){
    //        total*=last;
    //    }
    total = Math.pow(last, count);
    armstrong = ~~(armstrong / 10);
    sum += total;
    total = 1;
}
console.log(sum)
