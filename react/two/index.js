fetch('https://dummyjson.com/products')
.then((res)=>res.json())
.then((res)=>res.products.map((one)=>console.log(one)))