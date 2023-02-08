// let str = "";
// for(let i=1;i<=5;i++){
//     str=""
//     for(let j=i;j<=5;j++){
//         str+="  ";
//     }
//     for(let j=1;j<=(2*i-1);j++){
//         str+=" *";
//     }
//     console.log(str);
// }

// let str = "Nemat";
//  str="f"+str.substring(1);
// console.log(str)
// console.log(5+'5'+5)
let fectorial=1;
function fact(num) {

    if (num != 1) {
        console.log(num)
        fectorial *= num;
        fact(--num);
    }
    return fectorial;
}
console.log(fact(5))