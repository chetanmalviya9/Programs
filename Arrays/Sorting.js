let arr = [1,44,55,22,2,3,2,4,5,6,7,3];
// const sort=(arr)=>{
//     for(let i=0;i<arr.length-1;i++){
//         for (let j = i+1; j < arr.length; j++) {
//             if(arr[i]>arr[j]){
//                 let temp= arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//     }
//     console.log(arr)
//     // console.log(arr);
// }

arr.sort((a,b)=>a-b);
console.log(arr);