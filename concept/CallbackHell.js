const createOrder=(array,callback)=>{
    if(array){
        console.log("createOrder")
        callback(array);
    }
}
const makePayment=(array,callback)=>{
    if(array){
        console.log("makePayment");
        callback(array);
    }
}
const paymentReceived=(array,callback)=>{
    if(array){
        console.log("paymentReceived");
        callback(array);
    }
}
const orderSuccessfull=(array,callback)=>{
    if(array){
        console.log("orderSuccessfull");
        console.log(array);
    }
}
let array=[101,102,103];
createOrder(array,(array)=>{
    makePayment(array,(array)=>{
        paymentReceived(array,(array)=>{
            orderSuccessfull(array);
        })
    })
})