//콜백함수
//함수안에서 어떤 특정한 시점에 호출되는 함수
//일반적으로 콜백(callback)함수는 함수의 매개변수 전달하여 특정시점에 콜백함수를 실행한다.



// function plus(a,b,callback)
// {
//     let sum = a+b;
//     callback(sum); //플러스라는 함수 내부에서 callback매개변수를 함수형태로 실행
// }
// plus(1,2,function(res){//플러스 함수에 익명함수를 인자로 전달
//     console.log(res);
// });


// //정의된 함수를 인자로 전달하는 방법
// function minus(a,b,callback){
//     let res = a-b;
//     callback(res);
// }
// //콜백함수로 사용할 함수를 정의
// function Test(res)
// {
//     console.log(res);
// }
// minus(5,3,Test);

// function first(){
//     console.log('first 함수 호출');
// }
// function second(){
//     console.log("second 함수 호출");
// }

// first();
// second();

// function first1(){
//     setTimeout(function(){
//         console.log('first1 함수 실행');
//     },2000);
// }
// function second1(){
//     console.log("second1 함수 호출");
// }
// first1();
// second1();

// function first2(callback){
//     setTimeout(function(){
//         console.log('first2');
//         callback();
//     },2000);
// }

// function second2(){
//     console.log('second2');
// }
// first2(function(){
//     second2();
// });


// function Func_1(){
//     setTimeout(function(){
//         console.log(1);
//     },1000);
// }
// function Func_2(){
//     console.log(2);
// }
// function Func_3(){
//     console.log(3);
// }

// Func_1();
// Func_2();
// Func_3();

//1초뒤에 10을 더해서 반환하는 함수 만들어보기
// function increase(number,callback){
//     setTimeout(()=>{
//         const result =  number+10;
//         if(callback){
//             callback(result);
//         }
//     },1000);
// }
// increase(1,result=>{
//     console.log(result);
// })
//아래는 콜백지옥...
// console.log("작업시작");
// increase(0,result=>{
//     console.log(result);
//     increase(result,result=>{
//         console.log(result);
//         increase(result,result=>{
//             console.log(result);
//             increase(result,result=>{
//                 console.log(result);
//                 increase(result,result=>{
//                     console.log(result);
//                     increase(result,result=>{
//                         console.log(result);
//                         increase(result,result=>{
//                             console.log(result);
//                             console.log('작업완료');
//                         })
//                     })
//                 })
//             })
//         })
//     })
// })
//ES6 지원하는 promise
//then을 사용해서 그 다음 작업설정하기 때문에 콜백지옥이 형성되지 않는다.

function increase(number){
    const promise = new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const result = number+10;

            if(result>50){
                const error =  new Error("숫자오바됨");
                return reject(error);
            }
            resolve(result);//number값에 +10 성공
        },1000);
    })
    return promise;
}
// increase(0).then(number=>{
//     console.log(number);
//     return increase(number); //promise를 리턴하면
// })
// .then(number=>{
//     console.log(number);
//     return increase(number);
// })
// .then(number=>{
//     console.log(number);
//     return increase(number);
// })
// .then(number=>{
//     console.log(number);
//     return increase(number);
// })
// .then(number=>{
//     console.log(number);
//     return increase(number);
// })
// .then(number=>{
//     console.log(number);
//     return increase(number);
// })

//ES8 async, await
//이 문법을 사용하려면 함수의 앞부분에 async를 붙히고
//해당함수내부에서 promise의 앞부분에 await를 사용한다.
//요로코롬 하면 promise가 끝날때까지 기다리고 결과값을
//변수에 담을수 있다.
async function run(){

    try {
        let result = await increase(0);
        console.log(result);
        result =  await increase(result);
        console.log(result);
        result =  await increase(result);
        console.log(result);
        result =  await increase(result);
        console.log(result);
        result =  await increase(result);
        console.log(result);
        result =  await increase(result);
        console.log(result);
    } catch (error) {
       console.log(error); 
    }
}
run();