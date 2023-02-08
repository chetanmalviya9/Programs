let arr = [15, -2, 2, -8, 1, 7, 10, 23];
let sum = 0;
let count = 0;

for (let i = 0; i < arr.length; i++) {
    sum = arr[i];
    for (let j = i+1; j < arr.length; j++) {

        if (sum + arr[j] == 0) {
            if(j - (i-1)>count)
            count = j - (i-1);
        }
        sum += arr[j];
    }
}
console.log(count);