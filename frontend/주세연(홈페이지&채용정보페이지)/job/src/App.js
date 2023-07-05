import React from 'react';
import {Routes, Route} from 'react-router-dom';
import HomePage from "./pages/Home";
import DetailPage from "./pages/Detail";

function App(){
    return (     
      <Routes>
        <Route path="/" element = {<HomePage/>} />
        <Route path="/detail" element = {<DetailPage/>} />
        <Route path="*" element={<div>404 NotFound</div>}/>
      </Routes>    
    );
}


export default App;
 
