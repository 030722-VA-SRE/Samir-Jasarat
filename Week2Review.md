# AWS

### Cloud / AWS Overview
* How would you describe AWS? What is "the cloud" or "cloud computing" and why is it so popular now?

<p>AWS is a cloud computing platform offered by Amazon, and offers a wide range of services from compute, to storage, databases, and even machine learning and artificial intelligence. Cloud computing generally refers to the on demand delivery of IT resources over the internet with pay-as-you-go pricing. This allows individuals and companies to have access to powerful computing resources for a fraction of what it would cost to set up and maintain those same resources if they were not available as cloud offerings.</p>

* Define Infrastructure, Platform, and Software as a Service
 
 <p>IaaS: Contains the basic building blocks for cloud IT. It typically provides access to networking features, computers (virtual or dedicated hardware), and data storage space</p>

 <p>PaaS: Removes the need to manage underlying infrastructure and allows you to focus on the development and management of applications. This includes capacity planning, software maintenence, and other activities involving running an application.</p>

 <p>SaaS: SaaS provides a complete product that is run and managed by the service provider. With a SaaS offering, there is no concern about how the service is maintained or infastructure is managed.</p>
 
* What's the difference between a Region and an Availability Zone (AZ)?

</p>Both regions and AZ's refer to the locations of AWS Cloud data centers. AWS regions are large and dispersed into separate geographic locations. AZ's are distinct locations within an AWS region that are specifically engineered to be isolated from failures in other Availability Zones.
 
* How are you charged for using AWS services? Does it vary by service?
 
 <p>AWS offers pay-as-you-go pricing, which offers adaptibility to its customers and reduces the risk of overprovisioning or missing capacity.</p>
* Different ways to interact with AWS services?
<p>There are a few ways to interact with AWS services. There is the AWS console, which is a web based GUI that provides the ability to interact with AWS services. There is also the AWS CLI, which allows for interaction with AWS via a command line interface. AWS also has SDK's (Software Development Kits) that allow developers to interact with the platform through their own written code</p>.


### EC2

* What are the configuration options for EC2?

<p>EC2's are virtual computing environments that have various instance types, or configurations. These configurations include variations in CPU, memory, storage, and networking capacity.</p>
 
* What are the different EC2 instance sizes/types?

<p>AWS EC2 instance types include C4, C5, C5a, D2, D3, and many more. These instance types all have their own use cases for which they are optimized. AWS EC2 instance types follow a naming convention that correlates to the instance family, generation, size, and additional capabilities such as processor type, frequency type, and storage type.
 
* Once you create an EC2, how to connect to it?

<p>You can connect to an EC2 via SSH Client, EC2 Instance Connect, and the AWS Systems Manager Session Manager.</p>
 
* What are Security Groups? When defining a rule for a security group, what 3 things do you need to specify?

<p>EC2 security groups are essentially a virtual firewall for an EC2 instance, and work to control inbound and outbound traffic to and from the EC2 instance. When creating a security group, you must specifiy the Type, the Source, and the Description for that security group.</p>
  
* What's the difference between scalability, elasticity, and resiliency?
 
 <p>Scalability refers to the ability of a system to accomodate larger loads by adding resources either by making hardware stronger or adding additional nodes. Elasticity refers to the ability to fit the resources needed to cope with loads dynamically. Resiliency refers to ability of a computing infrastructure to recover and continue operations in the face of operational deficiencies or disaster</p>

* Ways of paying for EC2?
<p>AWS EC2 instances are based on the size of the instance, and a pay-as-you-go pricing model that is based on usage by the hour or usage by the second</p>


### RDS

* What's an RDS?

<p>A relational database service provided by Amazon. It is a cloud offering designed to simplify the set up, operation, and scaling of a relational database specifically for use in applications.</p>

* Which vendors are supported?

<p>Supports MySQL, PostgreSQL, MariaDB, SQL Server, and others.

# UNIX/LINUX

* What are the differences between a Thread and Process and a Service?

<p>A process is a computer program under execution. A threat is a lightweight process. A service is an application or set of applications that runs in the background (often carrying out essential tasks)</p>

* Write a basic bash script 
    * ie: installing java/maven/git to an ec2
    * if you're feeling ambitious, a script that would delete a file if it exists

```
#!/bin/bash

file="file_you_want_to_delete"

if [ -f "$file" ] ; then
    rm "$file"
fi
