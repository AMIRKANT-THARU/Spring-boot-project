package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

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
                * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                    font-family: 'Segoe UI', sans-serif;
                }

                body {
                    background: linear-gradient(135deg, #0f172a, #1e293b);
                    color: white;
                    min-height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }

                .container {
                    text-align: center;
                    width: 90%;
                    max-width: 1000px;
                }

                h1 {
                    font-size: 3rem;
                    margin-bottom: 15px;
                }

                .subtitle {
                    font-size: 1.2rem;
                    color: #cbd5e1;
                    margin-bottom: 40px;
                }

                .status {
                    background: #16a34a;
                    display: inline-block;
                    padding: 10px 20px;
                    border-radius: 30px;
                    font-weight: bold;
                    margin-bottom: 30px;
                }

                .cards {
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
                    gap: 20px;
                    margin-top: 30px;
                }

                .card {
                    background: rgba(255,255,255,0.08);
                    padding: 25px;
                    border-radius: 15px;
                    backdrop-filter: blur(10px);
                    transition: 0.3s;
                }

                .card:hover {
                    transform: translateY(-5px);
                }

                .card h3 {
                    margin-bottom: 10px;
                    color: #38bdf8;
                }

                .footer {
                    margin-top: 40px;
                    color: #94a3b8;
                }
            </style>
        </head>
        <body>

            <div class="container">

                <h1>🚀 DevOps CI/CD Pipeline</h1>

                <p class="subtitle">
                    Automated Build • Test • Scan • Deploy
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

                </div>

                <div class="footer">
                    <p>Deployment Time: Live</p>
                    <p>Developed by Amir Kant</p>
                </div>

            </div>

        </body>
        </html>
        """;
    }

    @GetMapping("/health")
    public String health() {
        return """
        {
            "status":"UP",
            "application":"DevOps Demo",
            "message":"All Systems Operational"
        }
        """;
    }

    @GetMapping("/about")
    public String about() {
        return """
        DevOps Final Project

        Technologies:
        - Spring Boot
        - Docker
        - Jenkins
        - SonarQube
        - Nginx
        - AWS EC2

        CI/CD Pipeline Successfully Implemented.
        """;
    }
}