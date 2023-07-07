import React, {useState,useEffect} from 'react';
import './Post.css';
import {useNavigate} from 'react-router-dom';
import axios from 'axios';

function Post(){
    const postJob = () =>{
        axios.post('',{
            /*서버내용 추가해야 함*/
        })
           .then(res=>{
              alert("공고 올리기에 성공하셨습니다!");
           })
           .catch(e=>{
            console.log(e);
           })
      }
    return (
        <div className='post'>
            <p>채용공고 올리기</p>

            <div className='post-detail'>
                <p>회사 이름</p>
                <input type='text'></input>
                <p>직무</p>
                <input type='text'></input>
                <p>설명</p>
                <input id="d" type='text' placeholder='자세한 설명은 빠른 구인에 도움이 됩니다 :)'></input>
            </div>
            <button onClick={()=>{
                postJob();
            }}>제출하기</button>
        </div>
    );
}
export default Post;