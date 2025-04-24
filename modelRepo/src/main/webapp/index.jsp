<form  action="formdata" method="get">
        <h2>College Admission Application</h2>
        <div>
            <label>Student Name:</label><br>
            <input type="text" size="20"placeholder="Enter Student name" name="studentName" />

        </div>
        <div>
            <label>Parent Name:</label><br>
            <input type="text" size="20"placeholder="Enter Parent name" name="parentName" />

        </div>
        <div>
            <label>Age:</label><br>
            <input type="number" size="20" name="age"/>

        </div>
        <div>
            <label>Contact number:</label><br>
            <input type="number" placeholder="enter contact number" name="contactNumber"/>
        </div>
        <div>
            <label>Email:</label><br>
            <input type="email" name="email">
        </div>

         <div>
             <label>Date of birth:</label><br>
             <input type="date" name="dateOfBirth"/>
         </div>
         <div>
            <label>Gender:</label><br>
            male<input name="Gender" type="radio" value="male"/>
            female <input name="Gender" type="radio" value="female">
        </div>
        <div>
            <label>Address:</label><br>
            <input type="type" placeholder="Enter address" name="address"/>
        </div>
        <div>
            <label>Combination:</label><br>
            <select name="dropdown">
                <option value="plaseSelect">Please select</option>
                <option value="physics">Physics</option>
                <option value="chemistry">Chemistry</option>
                <option value="mathematics">Mathematics<a</option>
                <option value="biology">Biology</option>
                <option value="CS">ComputerScience</option>
                <option value="stats" >Statics</option>
            </select>
        </div>
         <div>
             <label>Upload Photo:</label><br>
             <input type="file"/>
         </div>
         <div>
            <input  type="checkbox"/><label>accept terms and condition</label>

         </div>
         <div>
             <input type="submit" value="submit"/>
             <input type="reset" value="reset"/>
         </div>
