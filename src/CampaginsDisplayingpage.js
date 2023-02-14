import React, { useState,useEffect } from 'react'
import axios from 'axios';
import "./App.css";
import { Link } from 'react-router-dom';
function CampaginsDisplayingPage()
{
   
    const [posts, UseSetPost] = useState({})
    const [num, setNum] = useState(0);
    const [count, setcount] = useState();
    const [updatedpost, setupdatedpost] = useState({});
    var today = new Date();
    var dates =today.getFullYear() + '-' + (today.getMonth() + 1) + '-' + today.getDate();
    var  time=today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
    const [data, SetData] = useState();
function randomNumberInRange(min, max)
    {
  
    return Math.floor(Math.random() * (max - min + 1)) + min;
    }

    const handleClick = () => {
        
             
        setNum(randomNumberInRange(1, 6));
        
    };
   
 


    axios.get("http://localhost:3000/displaying").then(useState(handleClick))
    useEffect(() => {
        axios.get("http://localhost:8082/image/" + num).then((res) => {

            axios.get("http://localhost:8082/image/temp/" + num).then((res1) =>
            {
                
                 console.log("before:",res1.data.desiredcampaginviews);
                res1.data.desiredcampaginviews = res1.data.desiredcampaginviews - 1;
                if (res1.data.desiredcampaginviews >= 0) {
                    
                    console.log("after", res1.data.desiredcampaginviews);
                    axios.put("http://localhost:8082/image/puttemp", res1.data);
                    axios.get("http://localhost:8082/image/temp/" + num).then((res2) => {
                      

            const contentdata = { campagincurrentdate: dates, campagincurrenttime: time, images:res.data };
            const date = new Date(dates);
            const startdate = new Date(res.data?.campaginactivedate);
            const enddate = new Date(res.data?.campaginexpirydate);
            if (res2.data.desiredcampaginviews >=0) {
                
                
                console.log(res.data.desiredcampaginviews)
                console.log(contentdata);
                if (date >= startdate && date <= enddate) {
                    axios.post("http://localhost:8082/image/datacount", contentdata).then((res) => {
                        SetData(res.data);
                        setupdatedpost(res)
      
                        
                    })
                    console.log(res.data?.images.campaginid);
                   
                }

                
            }
                    })
                }
            }
          
                
                
            )

            console.log(dates);
         
           
            
           UseSetPost(res);    
        })
      
    }, [num]);
    

    
    return (
    
       <div>
           
            <div className='frontendcss'>
                <table class="table table-dark">
                    <tbody>
                <tr><td><h3><img src={updatedpost.data?.images?.campaginurl} alt="" width="100" height="100" /></h3></td></tr> 
                <tr><td><h3>CampaginCategory:{updatedpost.data?.images?.campagincategory}</h3></td></tr>      
                <tr><td><h3>Campagin Visited Date:{updatedpost.data?.campagincurrentdate}</h3><br/></td></tr>
                <tr><td><h3>Campagin visitedTime:{updatedpost.data?.campagincurrenttime}</h3><br /></td></tr> 
                </tbody>
                </table>   
            </div>
    
            <Link to="/"><button className="btn btn-primary">Back</button></Link>
    
    </div>
    );
}
export default CampaginsDisplayingPage;
