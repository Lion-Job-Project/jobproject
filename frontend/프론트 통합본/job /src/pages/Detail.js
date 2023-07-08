import React, {useState,useEffect} from 'react';
import './Detail.css';
import {useLocation,useNavigate} from 'react-router-dom';
import axios from 'axios';

function Detail(){
  const location = useLocation();
  useEffect(() => {
      console.log(location);
    }, [ location ])
  const search = location.searchJob; //search 시 사용될 식별자(회사이름)
  const show = location.showJob; //show 시 사용될 식별자(id. ex)1,2,3)

  const [companyName,setCompanyName] = useState(['']);
  const [position,setPosition] = useState(['']);
  const [description, setDescription] = useState(['']);
  const [application, setApplication] = useState(['']);

    const searchJob = () =>{
        axios.get("http://localhost:8080/jobposts",{
          params:{company_name:{search}}
        })
       .then(res=>{
          setCompanyName(res.data.company_name);
          setPosition(res.data.position);
          setDescription(res.data.description);
          setApplication(res.data.application_link);
       }) 
       .catch(e=>{
         console.log(e);
       })  
   }
   const showJob = () =>{
    axios.get("http://localhost:8080/jobposts",{
      params:{id:{show}}
    })
   .then(res=>{
      setCompanyName(res.data.company_name);
      setPosition(res.data.position);
      setDescription(res.data.description);
      setApplication(res.data.application_link);
   }) 
   .catch(e=>{
     console.log(e);
   })  
}

    return (     
    <div className='detail'>
        <p>채용정보</p>
        <div className='info'>
            <div className='title'>
              <p id="company-name">{companyName}</p>
              <p id="title-name">{position}</p>
            </div>
           <hr></hr>
           {/*수정필요*/}
           <div className='applyinfo'>
           <div className='aquire'>
              <p id='title'>설명</p>
              <p>{description}</p>
              <p id='title'>링크</p>
              <p>{application}</p>
            </div>

           </div>
      </div>
      <button /*onClick={()=>{ 로그인안되어있으면 로그인창으로
        id ==null? navigate('') : navigate('');
      }}*/ >자소서 작성하기</button>
    </div>
    );
}


export default Detail;