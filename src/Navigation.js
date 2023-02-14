import React from 'react'
import { Link, useMatch, useResolvedPath } from "react-router-dom"
 function Navigation () {
  return (
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <Link to="/" ClassName="site-title"></Link>
      
          <div class="collapse navbar-collapse justify-content-center" id="navbarCenteredExample">
              <ul class="navbar-nav mr-auto-center">
        <CustomLink to="/adding"><button  className='btn btn-primary'> Campaigns Entry</button></CustomLink>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <CustomLink to="/displaying"><button className='btn btn-primary'>Campaigns Display </button></CustomLink>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <CustomLink to="/finaldata"><button className='btn btn-primary'>Campagins Daily Report</button></CustomLink>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </ul>
        
        <div class="dropdown">
        
  <button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
    Available Campagins
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    <li><a class="dropdown-item" >Animals</a></li>
    <li><a class="dropdown-item" >Shirts</a></li>
  </ul>
        </div>
        </div> 
      </nav>
    
      
  )
}
function CustomLink({ to, children, ...props }) {
  const resolvedPath = useResolvedPath(to)
  const isActive = useMatch({ path: resolvedPath.pathname, end: true })

  return (
    <li className={isActive ? "active" : ""}>
      <Link to={to} {...props}>
        {children}
      </Link>
    </li>
  )
}

export default Navigation;