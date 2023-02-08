
// let arr = ["string", "array", "is", "suar"];
// // let arr = [3, 4, 5, 7, 6, 1, 2];
// let len = arr.length;
// for (let i = 0; i < parseInt(arr.length / 2); i++) {
//     arr[i] = arr[i] ^ arr[len - 1 - i];
//     arr[len - 1 - i] = arr[i] ^ arr[len - 1 - i];
//     arr[i] = arr[i] ^ arr[len - 1 - i];
// }
// arr.forEach(element => {
//     console.log(element);
// });

//-------------------------------------sum without arithmetic operator

// let a = 56;
// let b = 2;
// let carry;
// while(carry!=0){
//     sum=a^b;
//     carry = (a&b)<<1;
//     a=sum;
//    b=carry;
// }
// console.log(sum)

//------------------------------------- multiply without arithmetic operator

// let a = 5;
// let b = 2;
// multi=(a|b)<<1;
// multi=multi<<1;
// let result = 0;
// while (b > 0) {
//     if (b & 1) 
//     {
//         result += a;
//     }
//     a = a << 1;
//     b = b >> 1;
// }
// console.log(result)
// let a = 6;
// let b = 20;
// let carry;
// while(carry!=0){
//     sum=ab;
//     carry = (a&b)<<1;
//     a=sum;
//    b=carry;
// }
// // divide = (a|b)>>1;
// console.log(sum)
// let str = 7/2;

// console.log(~~str); 
//  3.4|0
//  3.4^0
//  3.4<<0
//  3.4>>0
//  3.4%1


// let arr = [1,2,3,4,5,5,6,2,2,12,2];
// let map = new Map();
// let i =3;
// for (const element of arr) {
//         map.set(element,i++);
//     }
//     // console.log(arr.length-set.size);
//     // for (let i = 0; i < set.size; i++) {
//        console.log(map.has())
//     // }


// let arr = [1,2,3,4,5,5,5,5,6,2,2,12,2];
// let n = arr.length;
// for(let i = 0; i<n;i++){
//     for(let j = i+1; j<n; j++){
//         if(arr[i]==arr[j]){
//             for(let k = j;k<n-1;k++){
//                 // let temp = arr[k];
//                 arr[k]=arr[k+1];
//                 // arr[k+1]=temp;
//             }
//             j--;
//             n--;
//         }
//     }
// }
// console.log(arr);
// let str = "Happy end Happy end";
// // let str = "what is your name and is your name is like the ways the work on the name";
// // let strArr = str.split(" ");
// let strArr=[];
// let str1='';
// for(let i =0; i< str.length;i++){
//     if(str[i]==' '){
//         strArr= [...strArr,str1];
//         // strArr= push(str1);
//         str1='';
//     }
//     else
//     {
//         str1+=str[i];
//     }
// }
// // strArr.push(str1)
// strArr= [...strArr,str1];
// console.log(strArr)

// let str4=""
// let n = strArr.length;
// for(let i = 0; i<n;i++){
//     if(strArr[i]!="end")
//     str4+=strArr[i];
// for(let j = i+1; j<n; j++){
//     if(strArr[i]==strArr[j]){
//         for(let k = j;k<n-1;k++){
//             let temp = strArr[k];
//             strArr[k]=strArr[k+1];
//             strArr[k+1]=temp;
//         }
//         j--;
//         n--;
//     }
// }
// }

// console.log(str4);

// let stack = new Array();
// let str = "{{{}}}({())(())";
// let map = new Map();
// map.set('[',']');
// map.set('{','}');
// map.set('(',')');
//  let value = [...map.values()];

// for(let i = 0; i<str.length;i++){
//     if(map.has(str[i])){
//         stack.push(str[i]);
//     }
//     else if(value.includes(str[i])){
//         if(stack.length&&map.get(stack[stack.length-1])==str[i])
//         {
//             stack.pop();
//         }
//         else{
//            break
//         }
//     }

// }
// console.log(!stack.length);
// 'use strict'
// let obj ={
//     name:"chetan",
//     roll_no:112,
//     add:{
//         city:"indore"
//     }
// }
// console.log(obj.add.name?.lastname);
// const adventurer = {
//     name: 'Alice',
//     cat: {
//       name: 'Dinah'
//     }
//   };

//   const dogName = adventurer.dog.name;
//   console.log(dogName);
//   // Expected output: undefined

//   console.log(adventurer.someNonExistentMethod?.());
//   // Expected output: undefined


// console.log(process.version);
// const createOrder=(array,callback)=>{
//     return new Promise((resolve, reject) => {
//         if(array){
//             console.log("createOrder")
//             resolve(array)
//     }});

//         // callback(array);
//     // }
// }
// const makePayment=(array,callback)=>{
//     if(array){
//         console.log("makePayment");
//         callback(array);
//     }
// }
// const paymentReceived=(array,callback)=>{
//     if(array){
//         console.log("paymentReceived");
//         callback(array);
//     }
// }
// const orderSuccessfull=(array,callback)=>{
//     if(array){
//         console.log("orderSuccessfull");
//         console.log(array);
//     }
// }
// let array=[101,102,103];
// createOrder(array,(array)=>{
//     makePayment(array,(array)=>{
//         paymentReceived(array,(array)=>{
//             orderSuccessfull(array);
//         })
//     })
// })
// createOrder(array).then((result)=>{

//     makePayment(result,(array)=>{
//                 paymentReceived(array,(array)=>{
//                     orderSuccessfull(array);
//                 })
//             })
// })
let array = [1, 2, 3, 4, 5];
for (let i = 0; i < parseInt(array.length / 2); i++) {
    array[i] = array[i] ^ array[array.length - i - 1]
    array[array.length - i - 1] = array[i] ^ array[array.length - i - 1]
    array[i] = array[i] ^ array[array.length - i - 1]
}
console.log(array);