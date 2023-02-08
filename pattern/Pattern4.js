// let str = "";
// for(let i=1;i<=5;i++){
//     str=""
//     for(let j=i;j<=5;j++){
//         str+=" ";
//     }
//     for(let j=1;j<=i;j++){
       
//         str+="* ";
       
//     }
//     console.log(str);
// }
let str1 = "";
for(let i=1;i<=5;i++){
    str1=""
    let a =i;
    for(let j=1;j<=i;j++){
        str1+=String.fromCharCode(j+64);
    }
    for(let j=2;j<=i;j++){
        str1+=String.fromCharCode((--a)+64);
    }
    console.log(str1);
}
