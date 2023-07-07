import React, {useState,useEffect} from 'react';
import './Detail.css';
import {useNavigate} from 'react-router-dom';
import axios from 'axios';

function Detail(){
   const [companyName,setCompanyName] = useState(['']);
   const [posion,setPosion] = useState(['']);
   const [description, setDescription] = useState(['']);
   const [application, setApplication] = useState(['']);
   
    /*서버내용 추가해야 함*/
     const getJob = () =>{
        axios.get()
        .then(res=>{
            
        }) 
        .catch(e=>{
        })  
      }

    return (     
    <div className='detail'>
        <p>채용정보</p>
        <div className='info'>
            <div className='title'>
              <p id="company-name">회사이름(ex.현대자동차(주))</p>
              <p id="title-name">공고제목(ex. 현대자동차 경력직 채용 - 생산/제조 부문)</p>
            </div>
           <hr></hr>
           <div className='applyinfo'>
           <div className='aquire'>
              <p id='title'>지원자격</p>
              <p id='subtitle'>경력</p>
              <p id='subtitle'>학력</p>
             </div>

            <div className='condition'>
             <p id='title'>근무조건</p>
             <p id='subtitle'>고용형태</p>
             <p id='subtitle'>급여</p>
             <p id='subtitle'>지역</p>
            </div>

           </div>
      </div>
      <button>자소서 작성하기</button>
    </div>
    );
}


export default Detail;