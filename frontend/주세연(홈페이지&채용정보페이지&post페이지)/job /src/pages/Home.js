import React, {useState,useEffect} from 'react';
import './Home.css';
import {useNavigate} from 'react-router-dom';
import axios from 'axios';

function Home(){
    const navigate = useNavigate();
    const companys =  [1,2,3,4,5,6,7,8,9];

    return (
        <div className='home'>

           <div className="header">
               <a href="http://localhost:3000/">🦁 JOBLION</a>
               <div className='search'>
                   <input type="text" placeholder='NEW JOB, NEW ME'></input>
                   
                   <button type="submit">⌕</button>
               </div>
                <div className='join'>
                    {/*로그인&회원가입&자소서창- 준호님 코드랑 연결해야됨*/}
                   <button type='submit'>로그인</button>
                   <button type="submit">회원가입</button>
                </div>
            </div>

            <div className='banner'>
               <h2>구인구직의 신세계로(가제)</h2>
               <p>쉽고 빠르게 확인하는 채용공고</p>
               <button>지금 바로 자소서 작성하기</button>
           </div>

             <div className='content'>
                <div className='titles'>
                  <p>💡채용 공고 한눈에 모아보기💡</p>
                  <button onClick={()=>{
                     window.open('http://localhost:3000/post','채용공고 올리기','resizable=no width=700 height=650');
                  }}>공고를 올리고 싶다면?</button>
                </div>
                <div className='showcase'>
                {companys.map((i)=>{
                    return(
                        <div key={i} className='company'>
                            <button id={i} onClick={()=>{
                                window.open('http://localhost:3000/detail','채용공고','resizable=no width=1000 height=600');
                            }}></button>
                        </div>
                    )
                })}
                </div>
             </div>

             <div className='lower'>
                <p>고객센터 : 1234-5678 (평일 09:00 ~ 19:00 토요일 09:00 ~ 15:00) | 단국대학교 멋쟁이 사자처럼(주)</p>
             </div>

        </div>

    )
}
export default Home;