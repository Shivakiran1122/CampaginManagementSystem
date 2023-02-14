import Navigation from "./Navigation";
import CampaginsDetailsEntry from "./CampaginsDetailsEntry";
import { Route, Routes } from "react-router-dom"
import CampaginsDataReport from "./CampaginsDataReport";
import CampaginsDisplayingPage from "./CampaginsDisplayingpage";
function App()
{
  return (
    <div>
      <Navigation />
      <div className="container">
      <Routes>
        
            <Route path="/adding" element={<CampaginsDetailsEntry />}></Route>
            <Route path="/displaying" element={<CampaginsDisplayingPage />}></Route>
          <Route path="/finaldata" element={<CampaginsDataReport/>}></Route>  
      </Routes>
      </div>
    </div>
  )
}
export default App;
