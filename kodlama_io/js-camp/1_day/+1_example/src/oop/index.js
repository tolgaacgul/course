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
        super(id, customerNumber)
        this.firstName = firstName;
    }
}

class CorporateCustomer extends Customer{
    constructor(companyName,id,customerNumber){
        super(id,customerNumber);
        this.companyName = companyName;
    }
}