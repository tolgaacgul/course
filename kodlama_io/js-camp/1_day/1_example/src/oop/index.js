class Customer{
    constructor(id,customerNumber){
        this.id = id;                           //burada instance'a prototyping yapıyor aslında 
        this.customerNumber = customerNumber;
    }
}

let customer = new Customer(1, "23");
console.log("id: " + customer.id + " " + "number: " + customer.customerNumber)


// Prototyping
// instance 'a yapılan prototyping
customer.name = "Tolga Açgül"
console.log(customer.name);

// class'a yapılan prototyping
Customer.bisey = "Bişey"
console.log(Customer.bisey)




// Base sınıf olarak kullanma 
class IndividualCustomer extends Customer{
    constructor(firstName, id, customerNumber){
        super(id, customerNumber);          //super customer'a yonlendirir
        this.firstName = firstName;
    }
}
class CorporateCustomer extends Customer{
    constructor(companyName,id,customerNumber){
        super(id,customerNumber);
        this.companyName = companyName;
    }
}

let individualCostomer = new IndividualCustomer("Tolga Açgül", 13, 1);
console.log(individualCostomer.firstName)


//------ Map / Filter / Reduce -----------

console.log("----------- Map / Filter / Reduce ----------");

let products = [
    {id:1, name:"macbook", price:2500},
    {id:2, name:"acer", price:1500},
    {id:3, name:"hp", price:1000},
    {id:4, name:"huawi", price:3400},
    {id:5, name:"huawi", price:1601}

]

console.log("<ul>");
products.map(product => console.log('<li>${product.name}</li>'))
console.log("</ul>");






// Filer
// filter filtreleme yaparak yeni bir array oluşturur

let filteredProducts = products.filter(product2 => product2.price>2345);
console.log(filteredProducts);



// REDUCE 
// acumalator total toplam almak için kullanılır
let cartTotal = products.reduce((acc, product)=>acc + product.price, 0);
console.log(cartTotal)


// Hepsini Kullnımı

let cartTotal2 = products
    .filter(p=>p.price>0)
    .map(p=>{
        p.price = p.price*1,18
        return p
    })
    .reduce((acc,p)=>acc+p.price,0)
console.log(cartTotal2)