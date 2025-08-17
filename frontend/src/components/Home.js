import React from 'react';
import { Link } from 'react-router-dom';

export default function Home() {
    return (
        <div className="homeContainer">
            {/* Hero Section */}
            <div className="heroSection">
                <h1>Welcome to CareerKey</h1>
                <p>Your one-stop destination for job opportunities.</p>
                
                <Link to="/login"><button className="ctaButton">Get Started</button></Link>
            </div>

            {/* Features Section */}
            <div className="featuresSection">
                <h2>Why Choose Us?</h2>
                <div className="featuresList">
                    <div className="feature">
                        <h3>Find Your Dream Job</h3>
                        <p>Search for thousands of jobs tailored to your skills and interests.</p>
                    </div>
                    <div className="feature">
                        <h3>Easy Applications</h3>
                        <p>Apply to jobs with just a few clicks.</p>
                    </div>
                    <div className="feature">
                        <h3>Trusted by Employers</h3>
                        <p>We connect you with top companies looking for talent.</p>
                    </div>
                </div>
            </div>

            {/* About Us Section */}
            <div className="testimonialsSection">
                <h2>About us</h2>
                <div className="testimonialsList">
                    <div className="testimonial">
                        <p><strong>Devansh Yadav</strong></p>
                        <p>devanshyadav6113@gmail.com</p>
                        <p>Btech Final Year Computer Engineering</p>
                    </div>
                    <div className="testimonial">
                        <p><strong>Mrunal Bhamare</strong></p>
                        <p>mrunalbhamare1524@gmail.com</p>
                        <p>Btech Final Year Computer Engineering</p>
                    </div>
                </div>
            </div>

            {/* Footer Section */}
            <div className="footerSection">
                <p>&copy; 2025 CareerKey. All rights reserved.</p>
            </div>
        </div>
    );
}
