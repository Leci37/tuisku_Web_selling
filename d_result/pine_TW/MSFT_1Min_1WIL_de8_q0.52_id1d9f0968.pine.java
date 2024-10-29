//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: MSFT_1Min_1WIL_1d9f0968 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1WIL_1d9f0968", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_1d9f0968(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 0.351952 )
		if( sDev <= 0.155862 )
			if( upperBand <= 0.238655 )
				if( Color_con2 <= -0.14222 )
					if( midLine <= 0.1504 )
						if( Color_con2 <= -0.317996 )
							if( wvf <= 0.105019 )
								if( Color_con2 <= -0.821249 )
									ret := 0.297619
								if( Color_con2 > -0.821249 )
									ret := -0.078931
							if( wvf > 0.105019 )
								if( Color_con1 <= 0.003018 )
									ret := 0.215352
								if( Color_con1 > 0.003018 )
									ret := -0.270270
						if( Color_con2 > -0.317996 )
							if( wvf <= 0.080071 )
								if( wvf <= 0.054079 )
									ret := 0.051690
								if( wvf > 0.054079 )
									ret := 0.214693
							if( wvf > 0.080071 )
								if( lowerBand <= 0.012896 )
									ret := 0.091711
								if( lowerBand > 0.012896 )
									ret := -0.125352
					if( midLine > 0.1504 )
						if( lowerBand <= 0.105794 )
							if( sDev <= 0.075638 )
								if( lowerBand <= 0.093647 )
									ret := 0.966667 // buy
								if( lowerBand > 0.093647 )
									ret := 0.600000
							if( sDev > 0.075638 )
								if( upperBand <= 0.232959 )
									ret := 0.166667
								if( upperBand > 0.232959 )
									ret := 0.769231 // buy
						if( lowerBand > 0.105794 )
							if( wvf <= 0.13545 )
								if( upperBand <= 0.217006 )
									ret := -0.750000 // sell
								if( upperBand > 0.217006 )
									ret := -0.500000
							if( wvf > 0.13545 )
								ret := 0.000000
				if( Color_con2 > -0.14222 )
					if( Color_con1 <= -0.087487 )
						if( sDev <= 0.124253 )
							if( midLine <= 0.162395 )
								if( lowerBand <= -0.001753 )
									ret := 0.008070
								if( lowerBand > -0.001753 )
									ret := -0.068255
							if( midLine > 0.162395 )
								if( Color_con2 <= -0.039494 )
									ret := 0.617021
								if( Color_con2 > -0.039494 )
									ret := -0.500000
						if( sDev > 0.124253 )
							if( lowerBand <= -0.058849 )
								if( lowerBand <= -0.069519 )
									ret := -0.256098
								if( lowerBand > -0.069519 )
									ret := 0.119048
							if( lowerBand > -0.058849 )
								if( Color_con2 <= 0.000811 )
									ret := -0.356913
								if( Color_con2 > 0.000811 )
									ret := 0.571429
					if( Color_con1 > -0.087487 )
						if( Color_con1 <= -0.061043 )
							if( Color_con2 <= -0.027779 )
								if( lowerBand <= -0.035781 )
									ret := -0.168224
								if( lowerBand > -0.035781 )
									ret := 0.073209
							if( Color_con2 > -0.027779 )
								if( lowerBand <= -0.061522 )
									ret := 0.708333 // buy
								if( lowerBand > -0.061522 )
									ret := 0.174365
						if( Color_con1 > -0.061043 )
							if( lowerBand <= -0.040373 )
								if( sDev <= 0.103408 )
									ret := -0.050000
								if( sDev > 0.103408 )
									ret := 0.238095
							if( lowerBand > -0.040373 )
								if( upperBand <= 0.225153 )
									ret := 0.013614
								if( upperBand > 0.225153 )
									ret := -0.180297
			if( upperBand > 0.238655 )
				if( upperBand <= 0.304056 )
					if( Color_con1 <= -0.293095 )
						ret := -1.000000 // sell
					if( Color_con1 > -0.293095 )
						if( Color_con2 <= -0.487713 )
							if( wvf <= 0.066576 )
								if( wvf <= 0.063828 )
									ret := 0.169811
								if( wvf > 0.063828 )
									ret := -1.000000 // sell
							if( wvf > 0.066576 )
								if( lowerBand <= 0.080259 )
									ret := 0.624473
								if( lowerBand > 0.080259 )
									ret := -0.285714
						if( Color_con2 > -0.487713 )
							if( wvf <= 0.317787 )
								if( upperBand <= 0.298794 )
									ret := 0.112861
								if( upperBand > 0.298794 )
									ret := 0.270742
							if( wvf > 0.317787 )
								if( Color_con2 <= 0.149327 )
									ret := -0.431818
								if( Color_con2 > 0.149327 )
									ret := 0.037037
				if( upperBand > 0.304056 )
					if( Color_con1 <= -0.244023 )
						if( midLine <= 0.212418 )
							if( Color_con1 <= -0.272529 )
								if( wvf <= 0.026648 )
									ret := -0.391304
								if( wvf > 0.026648 )
									ret := 0.240741
							if( Color_con1 > -0.272529 )
								if( Color_con2 <= -0.218083 )
									ret := -0.690476
								if( Color_con2 > -0.218083 )
									ret := -0.251656
						if( midLine > 0.212418 )
							if( Color_con2 <= -0.212387 )
								if( midLine <= 0.35775 )
									ret := 0.244565
								if( midLine > 0.35775 )
									ret := -0.142857
							if( Color_con2 > -0.212387 )
								if( Color_con2 <= -0.121777 )
									ret := -0.100000
								if( Color_con2 > -0.121777 )
									ret := 0.555556
					if( Color_con1 > -0.244023 )
						if( Color_con2 <= -0.272893 )
							if( wvf <= 0.109755 )
								if( lowerBand <= 0.008125 )
									ret := -1.000000 // sell
								if( lowerBand > 0.008125 )
									ret := 0.425926
							if( wvf > 0.109755 )
								if( lowerBand <= 0.137988 )
									ret := -0.274306
								if( lowerBand > 0.137988 )
									ret := 0.025641
						if( Color_con2 > -0.272893 )
							if( Color_con2 <= -0.127753 )
								if( wvf <= 0.075392 )
									ret := 0.800000 // buy
								if( wvf > 0.075392 )
									ret := 0.170093
							if( Color_con2 > -0.127753 )
								if( Color_con2 <= -0.117276 )
									ret := -0.253589
								if( Color_con2 > -0.117276 )
									ret := 0.079118
		if( sDev > 0.155862 )
			if( lowerBand <= 0.224098 )
				if( upperBand <= 2.39537 )
					if( upperBand <= 1.67311 )
						if( Color_con2 <= 0.152218 )
							if( wvf <= 0.190437 )
								if( upperBand <= 0.602042 )
									ret := 0.006206
								if( upperBand > 0.602042 )
									ret := 0.087517
							if( wvf > 0.190437 )
								if( Color_con1 <= 0.002726 )
									ret := -0.040071
								if( Color_con1 > 0.002726 )
									ret := 0.267760
						if( Color_con2 > 0.152218 )
							if( Color_con1 <= 0.013745 )
								if( lowerBand <= -0.046683 )
									ret := 0.378378
								if( lowerBand > -0.046683 )
									ret := 0.864865 // buy
							if( Color_con1 > 0.013745 )
								if( Color_con1 <= 0.04269 )
									ret := -0.421053
								if( Color_con1 > 0.04269 )
									ret := 0.296296
					if( upperBand > 1.67311 )
						if( wvf <= 0.189798 )
							if( lowerBand <= -0.841575 )
								if( Color_con2 <= -1.66338 )
									ret := -1.000000 // sell
								if( Color_con2 > -1.66338 )
									ret := -0.750000 // sell
							if( lowerBand > -0.841575 )
								if( sDev <= 1.53375 )
									ret := -0.652174
								if( sDev > 1.53375 )
									ret := 0.750000 // buy
						if( wvf > 0.189798 )
							if( Color_con1 <= -1.69306 )
								if( sDev <= 1.16434 )
									ret := 0.863636 // buy
								if( sDev > 1.16434 )
									ret := -0.480000
							if( Color_con1 > -1.69306 )
								if( upperBand <= 1.88007 )
									ret := -0.347826
								if( upperBand > 1.88007 )
									ret := -0.956522 // sell
				if( upperBand > 2.39537 )
					if( lowerBand <= -0.384668 )
						if( wvf <= 0.105866 )
							if( sDev <= 1.67266 )
								ret := -0.285714
							if( sDev > 1.67266 )
								if( Color_con2 <= -2.48354 )
									ret := 0.500000
								if( Color_con2 > -2.48354 )
									ret := 1.000000 // buy
						if( wvf > 0.105866 )
							if( Color_con2 <= -2.36497 )
								ret := 0.714286 // buy
							if( Color_con2 > -2.36497 )
								ret := 1.000000 // buy
					if( lowerBand > -0.384668 )
						if( wvf <= 0.151872 )
							if( lowerBand <= -0.013824 )
								if( Color_con2 <= -1.26369 )
									ret := 0.250000
								if( Color_con2 > -1.26369 )
									ret := -1.000000 // sell
							if( lowerBand > -0.013824 )
								ret := -1.000000 // sell
						if( wvf > 0.151872 )
							if( lowerBand <= -0.126587 )
								if( Color_con1 <= -2.49414 )
									ret := 0.000000
								if( Color_con1 > -2.49414 )
									ret := -0.500000
							if( lowerBand > -0.126587 )
								ret := 1.000000 // buy
			if( lowerBand > 0.224098 )
				if( Color_con2 <= -2.81086 )
					ret := -1.000000 // sell
				if( Color_con2 > -2.81086 )
					if( midLine <= 1.19764 )
						if( Color_con1 <= -1.50573 )
							if( Color_con1 <= -1.65908 )
								ret := -0.250000
							if( Color_con1 > -1.65908 )
								if( Color_con1 <= -1.61245 )
									ret := -1.000000 // sell
								if( Color_con1 > -1.61245 )
									ret := -0.571429
						if( Color_con1 > -1.50573 )
							if( Color_con1 <= -1.06719 )
								if( upperBand <= 1.51821 )
									ret := 0.913043 // buy
								if( upperBand > 1.51821 )
									ret := 0.250000
							if( Color_con1 > -1.06719 )
								if( upperBand <= 1.13681 )
									ret := 0.278276
								if( upperBand > 1.13681 )
									ret := -0.318182
					if( midLine > 1.19764 )
						if( wvf <= 0.284214 )
							if( upperBand <= 2.40266 )
								ret := 1.000000 // buy
							if( upperBand > 2.40266 )
								ret := 0.750000 // buy
						if( wvf > 0.284214 )
							ret := 0.500000
	if( wvf > 0.351952 )
		if( upperBand <= 0.838086 )
			if( Color_con2 <= 0.120587 )
				if( wvf <= 0.418568 )
					if( Color_con2 <= 0.022626 )
						if( lowerBand <= 0.146538 )
							if( wvf <= 0.41025 )
								if( sDev <= 0.253526 )
									ret := -0.160221
								if( sDev > 0.253526 )
									ret := 0.050505
							if( wvf > 0.41025 )
								if( Color_con2 <= -0.172062 )
									ret := -0.378378
								if( Color_con2 > -0.172062 )
									ret := 0.640449
						if( lowerBand > 0.146538 )
							if( wvf <= 0.371651 )
								if( Color_con2 <= -0.226379 )
									ret := 0.734694 // buy
								if( Color_con2 > -0.226379 )
									ret := 0.278351
							if( wvf > 0.371651 )
								if( Color_con2 <= -0.222701 )
									ret := 0.463636
								if( Color_con2 > -0.222701 )
									ret := 0.052419
					if( Color_con2 > 0.022626 )
						if( wvf <= 0.370347 )
							if( sDev <= 0.280966 )
								if( midLine <= 0.30988 )
									ret := -0.102564
								if( midLine > 0.30988 )
									ret := 0.700000 // buy
							if( sDev > 0.280966 )
								if( lowerBand <= -0.119726 )
									ret := 0.000000
								if( lowerBand > -0.119726 )
									ret := 0.730769 // buy
						if( wvf > 0.370347 )
							if( Color_con1 <= -0.101993 )
								if( upperBand <= 0.508712 )
									ret := 0.758621 // buy
								if( upperBand > 0.508712 )
									ret := 0.339450
							if( Color_con1 > -0.101993 )
								if( midLine <= 0.280512 )
									ret := 0.124260
								if( midLine > 0.280512 )
									ret := 0.441860
				if( wvf > 0.418568 )
					if( Color_con2 <= -0.799728 )
						if( upperBand <= 0.764434 )
							if( wvf <= 0.460474 )
								ret := 0.200000
							if( wvf > 0.460474 )
								if( wvf <= 0.531574 )
									ret := -1.000000 // sell
								if( wvf > 0.531574 )
									ret := -0.722222 // sell
						if( upperBand > 0.764434 )
							ret := 0.000000
					if( Color_con2 > -0.799728 )
						if( midLine <= 0.580301 )
							if( Color_con1 <= -0.227326 )
								if( upperBand <= 0.748198 )
									ret := -0.485477
								if( upperBand > 0.748198 )
									ret := -0.072765
							if( Color_con1 > -0.227326 )
								if( lowerBand <= -0.115175 )
									ret := 0.309375
								if( lowerBand > -0.115175 )
									ret := -0.049023
						if( midLine > 0.580301 )
							if( midLine <= 0.657436 )
								if( Color_con2 <= -0.228928 )
									ret := -0.285714
								if( Color_con2 > -0.228928 )
									ret := 0.543860
							if( midLine > 0.657436 )
								if( wvf <= 0.72389 )
									ret := -0.200000
								if( wvf > 0.72389 )
									ret := -1.000000 // sell
			if( Color_con2 > 0.120587 )
				if( midLine <= 0.421331 )
					if( lowerBand <= -0.252962 )
						if( Color_con2 <= 0.765563 )
							if( upperBand <= 0.516289 )
								if( Color_con2 <= 0.706144 )
									ret := 0.333333
								if( Color_con2 > 0.706144 )
									ret := 1.000000 // buy
							if( upperBand > 0.516289 )
								if( Color_con2 <= 0.646003 )
									ret := -0.066038
								if( Color_con2 > 0.646003 )
									ret := -0.965517 // sell
						if( Color_con2 > 0.765563 )
							if( upperBand <= 0.786191 )
								ret := 1.000000 // buy
							if( upperBand > 0.786191 )
								ret := 0.500000
					if( lowerBand > -0.252962 )
						if( wvf <= 0.848023 )
							if( wvf <= 0.796372 )
								if( Color_con2 <= 0.491515 )
									ret := 0.244320
								if( Color_con2 > 0.491515 )
									ret := -0.416667
							if( wvf > 0.796372 )
								if( Color_con2 <= 0.233022 )
									ret := -0.250000
								if( Color_con2 > 0.233022 )
									ret := 0.750000 // buy
						if( wvf > 0.848023 )
							if( lowerBand <= -0.189622 )
								if( midLine <= 0.289002 )
									ret := -0.714286 // sell
								if( midLine > 0.289002 )
									ret := 1.000000 // buy
							if( lowerBand > -0.189622 )
								if( Color_con1 <= 0.170581 )
									ret := -1.000000 // sell
								if( Color_con1 > 0.170581 )
									ret := -0.600000
				if( midLine > 0.421331 )
					if( midLine <= 0.495086 )
						if( Color_con2 <= 0.247135 )
							if( upperBand <= 0.660788 )
								ret := 0.200000
							if( upperBand > 0.660788 )
								if( Color_con1 <= -0.072389 )
									ret := -0.487805
								if( Color_con1 > -0.072389 )
									ret := -0.869565 // sell
						if( Color_con2 > 0.247135 )
							if( Color_con2 <= 0.314883 )
								if( wvf <= 0.7577 )
									ret := 0.444444
								if( wvf > 0.7577 )
									ret := -1.000000 // sell
							if( Color_con2 > 0.314883 )
								if( lowerBand <= 0.058246 )
									ret := 0.250000
								if( lowerBand > 0.058246 )
									ret := 1.000000 // buy
					if( midLine > 0.495086 )
						if( midLine <= 0.519903 )
							if( sDev <= 0.277486 )
								ret := 0.400000
							if( sDev > 0.277486 )
								if( midLine <= 0.506836 )
									ret := 1.000000 // buy
								if( midLine > 0.506836 )
									ret := 0.750000 // buy
						if( midLine > 0.519903 )
							if( sDev <= 0.238203 )
								if( sDev <= 0.201792 )
									ret := 0.000000
								if( sDev > 0.201792 )
									ret := 1.000000 // buy
							if( sDev > 0.238203 )
								if( Color_con1 <= -0.062482 )
									ret := -0.750000 // sell
								if( Color_con1 > -0.062482 )
									ret := -0.285714
		if( upperBand > 0.838086 )
			if( lowerBand <= 1.76907 )
				if( midLine <= 1.68177 )
					if( Color_con2 <= -5.04032 )
						if( sDev <= 1.52417 )
							if( wvf <= 1.15136 )
								if( Color_con2 <= -7.12383 )
									ret := -0.846154 // sell
								if( Color_con2 > -7.12383 )
									ret := -1.000000 // sell
							if( wvf > 1.15136 )
								ret := -0.500000
						if( sDev > 1.52417 )
							ret := 0.000000
					if( Color_con2 > -5.04032 )
						if( midLine <= 0.613653 )
							if( Color_con1 <= -0.607296 )
								if( wvf <= 0.452865 )
									ret := -0.427083
								if( wvf > 0.452865 )
									ret := 0.175676
							if( Color_con1 > -0.607296 )
								if( Color_con2 <= 0.845077 )
									ret := 0.276344
								if( Color_con2 > 0.845077 )
									ret := -0.272727
						if( midLine > 0.613653 )
							if( wvf <= 1.43102 )
								if( wvf <= 1.24279 )
									ret := 0.111653
								if( wvf > 1.24279 )
									ret := -0.413174
							if( wvf > 1.43102 )
								if( Color_con1 <= -1.07522 )
									ret := -0.433333
								if( Color_con1 > -1.07522 )
									ret := 0.506224
				if( midLine > 1.68177 )
					if( wvf <= 2.07069 )
						if( midLine <= 3.76372 )
							if( wvf <= 0.537296 )
								if( sDev <= 1.589 )
									ret := 1.000000 // buy
								if( sDev > 1.589 )
									ret := -0.666667
							if( wvf > 0.537296 )
								if( upperBand <= 2.5298 )
									ret := 0.600000
								if( upperBand > 2.5298 )
									ret := 0.956989 // buy
						if( midLine > 3.76372 )
							if( wvf <= 1.18585 )
								ret := -1.000000 // sell
							if( wvf > 1.18585 )
								if( lowerBand <= -0.319048 )
									ret := 1.000000 // buy
								if( lowerBand > -0.319048 )
									ret := 0.000000
					if( wvf > 2.07069 )
						if( upperBand <= 9.7705 )
							if( wvf <= 4.40878 )
								if( wvf <= 2.40371 )
									ret := -0.625000
								if( wvf > 2.40371 )
									ret := 0.704545 // buy
							if( wvf > 4.40878 )
								if( Color_con1 <= -1.89815 )
									ret := -0.827586 // sell
								if( Color_con1 > -1.89815 )
									ret := 0.666667
						if( upperBand > 9.7705 )
							if( sDev <= 7.80313 )
								ret := 1.000000 // buy
							if( sDev > 7.80313 )
								ret := 0.500000
			if( lowerBand > 1.76907 )
				if( upperBand <= 10.7384 )
					if( wvf <= 5.83099 )
						if( upperBand <= 3.89405 )
							ret := -0.166667
						if( upperBand > 3.89405 )
							ret := -1.000000 // sell
					if( wvf > 5.83099 )
						ret := 0.500000
				if( upperBand > 10.7384 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_MSFT_1Min_1d9f0968(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


