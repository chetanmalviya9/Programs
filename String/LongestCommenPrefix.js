let str = ["dgeeksforgeeks", "egeeks", "sgeek", "sgeezer"];
const longestCommonPrefix = (arr) => {
    let str = "";
    let str1 = "";
    let len = arr.length;
    let k = 0;
    let minLen = 1234;
    for (let i = 0; i < len; i++) {
        if(arr[i].charAt(0)!=arr[i+1])
        console.log("jjfjf");
        if (arr[i].length < minLen) {
            k = i;
            minLen = arr[i].length;
        }
    }
    // str = arr[k];
    // console.log(k);
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i].length; j++) {
            if (arr[i].charAt(j) == arr[k].charAt(j)) {
                str1 +=arr[i].charAt(j);
            }   
            else
            break;
        }
        // if(str.length>str1.length){
            
            str=str1;
        // }
        str1="";
    }
    console.log(str)
    // console.log(str);
}
longestCommonPrefix(str)