let str = "";
for(let i=1;i<=5;i++){
    str=""
    for(let j=i;j<=5;j++){
        str+="  ";
    }
    for(let j=1;j<=5;j++){
        if(i==1||j==1||i==j||i==5||j==5||i+j==5+1)
        str+="*  ";
        else
        str+="   ";
    }
    console.log(str);
}
