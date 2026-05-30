package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>DevOps CI/CD Dashboard</title>
            <style>
                *{
                    margin:0;
                    padding:0;
                    box-sizing:border-box;
                    font-family:'Segoe UI',sans-serif;
                }

                body{
                    background:linear-gradient(135deg,#0f172a,#1e293b);
                    color:white;
                    min-height:100vh;
                    display:flex;
                    justify-content:center;
                    align-items:center;
                }

                .container{
                    text-align:center;
                    width:90%;
                    max-width:1100px;
                }

                h1{
                    font-size:3rem;
                    margin-bottom:15px;
                }

                .subtitle{
                    font-size:1.2rem;
                    color:#cbd5e1;
                    margin-bottom:30px;
                }

                .status{
                    background:#16a34a;
                    display:inline-block;
                    padding:12px 25px;
                    border-radius:30px;
                    font-weight:bold;
                    margin-bottom:30px;
                }

                .cards{
                    display:grid;
                    grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
                    gap:20px;
                    margin-top:20px;
                }

                .card{
                    background:rgba(255,255,255,0.08);
                    padding:25px;
                    border-radius:15px;
                    backdrop-filter:blur(10px);
                    transition:0.3s;
                }

                .card:hover{
                    transform:translateY(-5px);
                }

                .card h3{
                    margin-bottom:10px;
                    color:#38bdf8;
                }

                .card a{
                    color:white;
                    text-decoration:none;
                    font-weight:bold;
                }

                .footer{
                    margin-top:40px;
                    color:#94a3b8;
                }
            </style>
        </head>
        <body>

        <div class="container">

            <h1>🚀 DevOps CI/CD Pipeline</h1>

            <p class="subtitle">
                Automated Build • Test • Scan • Dockerize • Deploy
            </p>

            <div class="status">
                ✅ Application Running Successfully
            </div>

            <div class="cards">

                <div class="card">
                    <h3>🌱 Spring Boot</h3>
                    <p>REST API Service</p>
                </div>

                <div class="card">
                    <h3>🐳 Docker</h3>
                    <p>Containerized Deployment</p>
                </div>

                <div class="card">
                    <h3>⚙️ Jenkins</h3>
                    <p>CI/CD Automation</p>
                </div>

                <div class="card">
                    <h3>🔍 SonarQube</h3>
                    <p>Code Quality Analysis</p>
                </div>

                <div class="card">
                    <h3>🌐 Nginx</h3>
                    <p>Reverse Proxy Server</p>
                </div>

                <div class="card">
                    <h3>☁️ AWS EC2</h3>
                    <p>Cloud Infrastructure</p>
                </div>

                <div class="card">
                    <h3>💚 Health Check</h3>
                    <a href="/health">Open Health Page</a>
                </div>

                <div class="card">
                    <h3>📘 About Project</h3>
                    <a href="/about">Open About Page</a>
                </div>

            </div>

            <div class="footer">
                <p>🚀 CI/CD Pipeline Successfully Running</p>
                <p>Developed by Amir Kant</p>
            </div>

        </div>

        </body>
        </html>
        """;
    }

    @GetMapping(value = "/health", produces = "text/html")
    public String health() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Health Check</title>

            <style>
                body{
                    background:#0f172a;
                    color:white;
                    font-family:'Segoe UI',sans-serif;
                    display:flex;
                    justify-content:center;
                    align-items:center;
                    height:100vh;
                    margin:0;
                }

                .card{
                    background:#1e293b;
                    width:450px;
                    padding:40px;
                    border-radius:20px;
                    text-align:center;
                    box-shadow:0 0 25px rgba(0,0,0,0.4);
                }

                .status{
                    font-size:4rem;
                    margin-bottom:15px;
                }

                .healthy{
                    color:#22c55e;
                }

                p{
                    color:#cbd5e1;
                    margin:10px 0;
                }

                a{
                    display:inline-block;
                    margin-top:20px;
                    color:#38bdf8;
                    text-decoration:none;
                    font-weight:bold;
                }
            </style>

        </head>

        <body>

            <div class="card">

                <div class="status healthy">✅</div>

                <h1>Application Healthy</h1>

                <p><strong>Status:</strong> UP</p>
                <p><strong>Application:</strong> DevOps Demo</p>
                <p><strong>Environment:</strong> Production</p>
                <p><strong>Services:</strong> Operational</p>

                <a href="/">⬅ Back to Dashboard</a>

            </div>

        </body>
        </html>
        """;
    }

    @GetMapping(value = "/about", produces = "text/html")
    public String about() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>About Project</title>

            <style>

                body{
                    background:linear-gradient(135deg,#0f172a,#1e293b);
                    color:white;
                    font-family:'Segoe UI',sans-serif;
                    display:flex;
                    justify-content:center;
                    align-items:center;
                    min-height:100vh;
                    margin:0;
                }

                .container{
                    width:90%;
                    max-width:800px;
                    background:rgba(255,255,255,0.08);
                    padding:40px;
                    border-radius:20px;
                    text-align:center;
                }

                h1{
                    color:#38bdf8;
                    margin-bottom:20px;
                }

                ul{
                    list-style:none;
                    padding:0;
                }

                li{
                    padding:12px;
                    margin:10px 0;
                    background:rgba(255,255,255,0.05);
                    border-radius:10px;
                }

                p{
                    color:#cbd5e1;
                }

                a{
                    display:inline-block;
                    margin-top:20px;
                    color:#38bdf8;
                    text-decoration:none;
                    font-weight:bold;
                }

            </style>

        </head>

        <body>

            <div class="container">

                <h1>📘 DevOps Final Project</h1>

                <p>
                    Complete End-to-End CI/CD Pipeline Implementation.
                </p>

                <br>

                <ul>
                    <li>🌱 Spring Boot REST Application</li>
                    <li>🐳 Docker Containerization</li>
                    <li>⚙️ Jenkins Automation</li>
                    <li>🔍 SonarQube Quality Analysis</li>
                    <li>🌐 Nginx Reverse Proxy</li>
                    <li>☁️ AWS EC2 Deployment</li>
                    <li>🔄 Automated CI/CD Workflow</li>
                </ul>

                <br>

                <h2>🚀 Pipeline Flow</h2>

                <p>
                    GitHub → Jenkins → Maven Build →
                    SonarQube Scan → Docker Build →
                    Docker Deploy → Production
                </p>

                <br>

                <a href="/">⬅ Back to Dashboard</a>

            </div>

        </body>
        </html>
        """;
    }
}
