var employee = () => {
    this.getName = () =>{
        return this.name;
    }
    this.getBirthDay = () =>{
        return this.birthDay;
    }
    this.getPhone = () =>{
        return this.phone;
    }
    this.getEmail = () =>{
        return this.email;
    }
    this.getCmnd = () =>{
        return this.cmnd;
    }
    this.getLevel = () =>{
        return this.level;
    }
    this.getLocation = () =>{
        return this.location;
    }
    this.getSalary = () =>{
        if(this.getLocation === "Manager"){
            this.salary = 500;
        }else if(this.getLocation === "Sale"){
            this.salary = 300;
        }else if(this.getLocation === "Marketing"){
            this.salary = 200;
        }
        return this.salary;
    }
    this.setName = (name) =>{
        this.name=name;
    }
    this.setBirthDay = (birthDay) =>{
        this.birthDay = birthDay;
    }
    this.setPhone = (phone) =>{
        this.phone=phone;
    }
    this.setEmail = (email) =>{
        this.email=email;
    }
    this.setCmnd = (cmnd) =>{
        this.cmnd=cmnd;
    }
    this.setLevel = (level) =>{
        this.level=level;
    }
    this.setLocation = (location) =>{
        this.location=location;
    }
}