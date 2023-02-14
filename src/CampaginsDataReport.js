import React, { useState,useEffect } from 'react'
import axios from 'axios';
import "./App.css";
import { Link } from 'react-router-dom';
function CampaginsDataReport () {
    const [item, setdata] = useState([])
  useEffect(() => {
   
     axios.get("http://localhost:8082/image/finaldata").then((res) => {
            setdata(res)
     })
    
    
      
 }, []);
  const data = item.data 
  console.log(data)
  let lengthdata = [];
  for (let i = 0; i < data?.length; i++)
  {
    
    lengthdata.push(i);
  }
 
  return (
    <div>
    <table class="table table-dark">   
    <thead >
    <tr>
      <th scope="col">Image</th>
      <th scope="col">CampaginName</th>
      <th scope="col">CampaginCategory</th>
      <th scope="col">Campagin CurrentDate</th>
      <th scope="col">SuccessCampaginViews</th>
      <th scope="col">DesiredCampaginViews</th>
      <th scope="col">EfficiencyStatus</th>
    </tr>
    </thead>
                
              <tbody>
                  
                  {lengthdata.map((item) => (
                    <tr key={item}>
                      <td><img src={data?.[item].campaginurl} alt="" className='' width="100" height="100" /></td>
                      <td>{data?.[item].campaginname}</td>
                      <td> {data?.[item].campagincategory}</td>
                      <td> {data?.[item].campagincurrentdate}</td>
                      <td> {data?.[item].successcampaginviews}</td>
                      <td> {data?.[item].desiredcampaginviews}</td>
                      <td> {data?.[item].efficiencystatus}{"%"}</td>
                      </tr>))
}

              </tbody>
        </table>
             
         <Link to="/"><button class="btn btn-primary">Back</button></Link>
          
    </div>
  )
}
export default CampaginsDataReport;


 