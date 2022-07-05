Sample hibernate program to add items to shopping cart and update the quantity after check out and create an invoice. Also there are methods to add new items but it can be done be plain sql also

pre req : configure a derby server and create a SampleDB and inventory table and add sample items

sample execution

Inventory [Id=107, productName=shirt-men, quantity=91, productPrice=20.2]
Inventory [Id=108, productName=shirt-boy, quantity=94, productPrice=10.3]
Inventory [Id=109, productName=shirt-women, quantity=100, productPrice=30.5]
Inventory [Id=110, productName=shirt-girl, quantity=89, productPrice=15.0]
Inventory [Id=111, productName=tshirt-men, quantity=90, productPrice=5.2]
Inventory [Id=112, productName=tshirt-women, quantity=93, productPrice=7.2]
Inventory [Id=113, productName=tshirt-boy, quantity=98, productPrice=2.2]
Inventory [Id=114, productName=tshirt-girl, quantity=100, productPrice=6.2]
Enter product id (107-114)
114
Enter quantity
5
Do you want to continue? (yes/no)
yes
Enter product id (107-114)
113
Enter quantity
5
Do you want to continue? (yes/no)
no
ProductName	Price	Quantity	Amount
tshirt-boy	2.20	5			$11.00
tshirt-girl	6.20	5			$31.00
				Total Price : 	$42.00