let num = 17;
let count = 0;
for (let j = 1; j < 51; j++) {
    count = 0;
    if (j == 1) {
        count++;
    }
    for (let i = 2; i <= ~~(j / 2); i++) {
        if (j % i == 0) {
            count++;
            break;
        }
    }
    if (count == 0)
        console.log(j);
}