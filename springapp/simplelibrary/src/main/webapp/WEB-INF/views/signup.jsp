<div>
  <h2>Sign up for the library!</h2>
  <form action="index" onsubmit="return validate()" method="post">
    <div>
      <label for="username">Username*</label>
      <input type="text" placeholder="Enter a username" id="username" required>
    </div>
    <div>
      <label for="email">Email*</label>
      <input type="email" placeholder="Enter an email" id="email" required>
    </div>
    <div>
      <label for="password">Password*</label>
      <input type="password" placeholder="Enter a Password" id="password" required>
    </div>
    <div>
      <label for="passwordConfirm">Confirm password*</label>
      <input type="password" placeholder="Confirm your Password" id="passwordConfirm" required>
    </div>
    <div>
      <label for="birthdate">Date of birth</label>
      <input type="date" placeholder="mm/dd/yyyy" id="birthdate">
    </div>
    <div>
      <label for="phone">Phone number</label>
      <input type="tel" placeholder="0-000-000-0000" id="phone">
    </div>
    <div>
      <span style="font-size:0.8em">Required fields marked with *</span> <br />
      <span style="font-size:0.8em">Usernames and passwords must only contain alphanumeric characters.</span>
    </div>
    <div>
      <input type="submit" value="Register"/>
    </div>
  </form>
</div>
