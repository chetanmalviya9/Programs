let str = "";
for(let i=1;i<=5;i++){
    str=""
    for(let j=i;j<=5;j++){
        str+=" ";
    }
    for(let j=1;j<=i;j++){
       
        str+="* ";
       
    }
    console.log(str);
}
let str1 = "";
for(let i=1;i<=5;i++){
    str1=""
    for(let j=1;j<=i;j++){
        str1+=" ";
    }
    for(let j=i;j<=5;j++){
       
        str1+="* ";
       
    }
    console.log(str1);
}
