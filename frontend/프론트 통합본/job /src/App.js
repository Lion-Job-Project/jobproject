import React from 'react';
import {Routes, Route} from 'react-router-dom';
import HomePage from "./pages/Home";
import DetailPage from "./pages/Detail";
import PostPage from "./pages/Post";
import SignupPage from "./pages/Signup";
import LoginPage from "./pages/Login";

function App(){
    return (     
      <Routes>
        <Route path="/" element = {<HomePage/>} />
        <Route path="/detail" element = {<DetailPage/>} />
        <Route path="/post" element = {<PostPage/>} />        
        <Route path="/signup" element = {<SignupPage/>} />
        <Route path="/login" element = {<LoginPage/>} />        
        <Route path="*" element={<div>404 NotFound</div>}/>
      </Routes>    
    );
}


export default App;
 
