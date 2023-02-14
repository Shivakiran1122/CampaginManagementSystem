import React, { useState } from 'react'
import axios from "axios";
import { Link } from 'react-router-dom';
 function CampaginsDetailsEntry () {
   const [imagename, setImageName] = useState("")
    const [imagetype, setImageType] = useState("")
    const [imageurl, setImageUrl] = useState("")
    const [campaginactivedate, setstartdate] = useState("");
    const [campaginexpirydate, setenddate] = useState("");
    const [views, setviews] = useState();
  
  
   const addData=(e)=>{
        e.preventDefault();
       const contentdata = { campaginname:imagename,campagincategory: imagetype, campaginurl: imageurl,campaginactivedate:campaginactivedate,campaginexpirydate:campaginexpirydate,desiredcampaginviews:views};
     console.log(contentdata);
      axios.post("http://localhost:8082/image/data",contentdata).then((res)=>{    
        alert("added successfully");
      })
     axios.post("http://localhost:8082/image/tempdata",contentdata)
    
  }
  

  return (
    <div >
          <form onSubmit={addData}>
              <center>        
          
  <div className="col-sm-5">
                       <label htmlFor="labelimageName" className="col-sm-2 col-form-label"><b>CampaginName</b></label>
                      <input type="text"  className="form-control"id="labelimageName"  required placeholder='Enter  CampaginName' value={imagename} onChange={(event) => setImageName(event.target.value)} /><br/>
         </div>

         <div className="col-sm-5">
                       <label htmlFor="labelimagetype" className="col-sm-2 col-form-label"><b>CampaginCategory</b></label>
                      <input type="text"  className="form-control"id="labelimagetype"  required placeholder='Enter  CampaginCategory' value={imagetype} onChange={(event) => setImageType(event.target.value)} /><br/>
          </div>
          
         <div className="col-sm-5">
              <label htmlFor="labelimageurl" className="col-sm-2 col-form-label"><b>CampaginURL</b></label>
              <input type="text"  className="form-control"id="labelimageurl"  required placeholder='Enter CampaginURL' value={imageurl} onChange={(event) => setImageUrl(event.target.value)} /><br/>
          </div>

           <div className="col-sm-5">
              <label htmlFor="labelviews" className="col-sm-2 col-form-label"><b>DesiredCampaginViews</b></label>
              <input type="text"  className="form-control"id="labelviews"  required placeholder='Enter Desired Campagin views' value={views} onChange={(event) => setviews(event.target.value)} /><br/>
          </div>

        </center>
         <div className="row">
        <div className="col-md-12 text-center">
            	<label><b>CampaginActiveDate : &nbsp;&nbsp;</b></label>
            <input type="date" name="CampaginActiveDate"   value={campaginactivedate} onChange={(event) => setstartdate(event.target.value)} />&nbsp;&nbsp;
            <label><b>CampaginExpiryDate : &nbsp;&nbsp;</b> </label>
							<input type="date" name="CampaginExpiryDate"  value={campaginexpirydate} onChange={(event) => setenddate(event.target.value)}/>
        </div>
    </div>
        
          
          
        <br />
        <center>
                  <button type="submit" className="btn btn-success" onClick={() => window.location.reload(false)}>Add Data</button>&nbsp;&nbsp;
                  <Link to="/"><button className="btn btn-primary">Back</button></Link>
        </center>
          </form>
          
      
      
    </div>
  
  )
}

export default CampaginsDetailsEntry;
