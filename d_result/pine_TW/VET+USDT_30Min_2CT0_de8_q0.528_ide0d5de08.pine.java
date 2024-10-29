//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: VETUSDT_30Min_2CT0_e0d5de08 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2CT0_e0d5de08", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_e0d5de08(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -1.30589e+07 )
		if( mf <= -0.144358 )
			if( tema <= 0.129294 )
				if( ema12 <= -0.003417 )
					ret := 1.000000 // buy
				if( ema12 > -0.003417 )
					if( ad_mf <= -1.973e+07 )
						if( ema12 <= 0.000302 )
							if( ad <= -1.78419e+08 )
								if( tema <= 0.041543 )
									ret := 0.000000
								if( tema > 0.041543 )
									ret := -1.000000 // sell
							if( ad > -1.78419e+08 )
								if( ad_mf <= -8.81546e+07 )
									ret := 0.734375 // buy
								if( ad_mf > -8.81546e+07 )
									ret := 0.350649
						if( ema12 > 0.000302 )
							if( ema12 <= 0.000356 )
								ret := -0.500000
							if( ema12 > 0.000356 )
								if( mf <= -0.178121 )
									ret := -1.000000 // sell
								if( mf > -0.178121 )
									ret := -0.500000
					if( ad_mf > -1.973e+07 )
						if( ad <= -1.95184e+07 )
							ret := -1.000000 // sell
						if( ad > -1.95184e+07 )
							if( ema2 <= 0.120241 )
								if( ema12 <= -0.000163 )
									ret := 0.134483
								if( ema12 > -0.000163 )
									ret := 0.372671
							if( ema2 > 0.120241 )
								if( ema13 <= -0.001361 )
									ret := 0.000000
								if( ema13 > -0.001361 )
									ret := -0.888889 // sell
			if( tema > 0.129294 )
				if( ad_mf <= -2.61976e+07 )
					if( ema13 <= -0.005892 )
						ret := 1.000000 // buy
					if( ema13 > -0.005892 )
						if( ema1 <= 0.217059 )
							if( mf <= -0.196127 )
								if( ema13 <= -0.002597 )
									ret := 0.214286
								if( ema13 > -0.002597 )
									ret := -0.800000 // sell
							if( mf > -0.196127 )
								if( ema13 <= -0.003171 )
									ret := 0.692308
								if( ema13 > -0.003171 )
									ret := 0.142857
						if( ema1 > 0.217059 )
							if( ema3 <= 0.235837 )
								ret := -0.750000 // sell
							if( ema3 > 0.235837 )
								ret := -1.000000 // sell
				if( ad_mf > -2.61976e+07 )
					if( ema13 <= -0.002081 )
						if( ad <= -1.73131e+07 )
							if( ema1 <= 0.146078 )
								ret := -0.750000 // sell
							if( ema1 > 0.146078 )
								ret := -1.000000 // sell
						if( ad > -1.73131e+07 )
							ret := -0.600000
					if( ema13 > -0.002081 )
						if( ema3 <= 0.143993 )
							if( ema12 <= 4.3e-05 )
								if( ad_mf <= -1.64393e+07 )
									ret := -0.200000
								if( ad_mf > -1.64393e+07 )
									ret := -0.916667 // sell
							if( ema12 > 4.3e-05 )
								ret := 0.250000
						if( ema3 > 0.143993 )
							ret := 0.714286 // buy
		if( mf > -0.144358 )
			if( ema12 <= -0.000122 )
				if( ad <= -9.06587e+07 )
					if( ema13 <= -0.00379 )
						if( ad_mf <= -9.74562e+07 )
							if( ad <= -1.09131e+08 )
								if( ema1 <= 0.145725 )
									ret := -0.500000
								if( ema1 > 0.145725 )
									ret := 0.785714 // buy
							if( ad > -1.09131e+08 )
								ret := 1.000000 // buy
						if( ad_mf > -9.74562e+07 )
							ret := -1.000000 // sell
					if( ema13 > -0.00379 )
						if( ad_mf <= -1.3138e+08 )
							if( ema3 <= 0.081841 )
								if( ema3 <= 0.039099 )
									ret := 0.250000
								if( ema3 > 0.039099 )
									ret := 1.000000 // buy
							if( ema3 > 0.081841 )
								ret := 0.000000
						if( ad_mf > -1.3138e+08 )
							if( ema12 <= -0.000204 )
								if( mf <= 0.002398 )
									ret := 0.966667 // buy
								if( mf > 0.002398 )
									ret := 0.600000
							if( ema12 > -0.000204 )
								ret := 0.500000
				if( ad > -9.06587e+07 )
					if( ema1 <= 0.13092 )
						if( ad <= -2.23887e+07 )
							if( ema13 <= -0.002514 )
								if( ad <= -8.53157e+07 )
									ret := -1.000000 // sell
								if( ad > -8.53157e+07 )
									ret := 0.387978
							if( ema13 > -0.002514 )
								if( ad <= -2.26535e+07 )
									ret := 0.121866
								if( ad > -2.26535e+07 )
									ret := -0.720930 // sell
						if( ad > -2.23887e+07 )
							if( ad_mf <= -2.08064e+07 )
								if( mf <= 0.065699 )
									ret := 0.672840
								if( mf > 0.065699 )
									ret := -0.090909
							if( ad_mf > -2.08064e+07 )
								if( ad <= -1.97584e+07 )
									ret := -0.144231
								if( ad > -1.97584e+07 )
									ret := 0.268470
					if( ema1 > 0.13092 )
						if( ad_mf <= -3.00013e+07 )
							if( ema13 <= -0.000718 )
								if( ema1 <= 0.135368 )
									ret := -0.285714
								if( ema1 > 0.135368 )
									ret := 0.309645
							if( ema13 > -0.000718 )
								if( ema12 <= -0.000437 )
									ret := -0.586207
								if( ema12 > -0.000437 )
									ret := 0.133333
						if( ad_mf > -3.00013e+07 )
							if( ema3 <= 0.21492 )
								if( ad_mf <= -2.98954e+07 )
									ret := -1.000000 // sell
								if( ad_mf > -2.98954e+07 )
									ret := -0.092308
							if( ema3 > 0.21492 )
								if( ad_mf <= -1.50106e+07 )
									ret := -0.634146
								if( ad_mf > -1.50106e+07 )
									ret := 0.750000 // buy
			if( ema12 > -0.000122 )
				if( ad <= -1.38768e+07 )
					if( ema13 <= 0.000429 )
						if( mf <= 0.06351 )
							if( ad_mf <= -1.39343e+07 )
								if( ema2 <= 0.030997 )
									ret := 0.109551
								if( ema2 > 0.030997 )
									ret := -0.025303
							if( ad_mf > -1.39343e+07 )
								if( ema2 <= 0.032143 )
									ret := -1.000000 // sell
								if( ema2 > 0.032143 )
									ret := -0.750000 // sell
						if( mf > 0.06351 )
							if( ema13 <= 2.4e-05 )
								if( ema13 <= -0.000212 )
									ret := -0.604651
								if( ema13 > -0.000212 )
									ret := -0.248322
							if( ema13 > 2.4e-05 )
								if( ema3 <= 0.021245 )
									ret := 0.150000
								if( ema3 > 0.021245 )
									ret := -0.163142
					if( ema13 > 0.000429 )
						if( tema <= 0.209217 )
							if( ema12 <= 0.000223 )
								if( ema2 <= 0.167787 )
									ret := 0.371025
								if( ema2 > 0.167787 )
									ret := -0.625000
							if( ema12 > 0.000223 )
								if( ad_mf <= -4.61742e+07 )
									ret := 0.015576
								if( ad_mf > -4.61742e+07 )
									ret := 0.159733
						if( tema > 0.209217 )
							if( ema13 <= 0.005466 )
								if( mf <= -0.047463 )
									ret := 0.000000
								if( mf > -0.047463 )
									ret := -0.568182
							if( ema13 > 0.005466 )
								if( tema <= 0.235762 )
									ret := 0.411765
								if( tema > 0.235762 )
									ret := -0.333333
				if( ad > -1.38768e+07 )
					if( ad_mf <= -1.33827e+07 )
						if( mf <= -0.107778 )
							if( ema13 <= -0.000179 )
								ret := 0.500000
							if( ema13 > -0.000179 )
								if( ema13 <= -0.000135 )
									ret := -1.000000 // sell
								if( ema13 > -0.000135 )
									ret := -0.250000
						if( mf > -0.107778 )
							if( ema13 <= 0.00097 )
								if( ema13 <= -0.0001 )
									ret := 0.263158
								if( ema13 > -0.0001 )
									ret := 0.725146 // buy
							if( ema13 > 0.00097 )
								if( mf <= 0.147772 )
									ret := 0.560000
								if( mf > 0.147772 )
									ret := -0.071429
					if( ad_mf > -1.33827e+07 )
						if( ema13 <= 0.000862 )
							if( ema2 <= 0.040327 )
								if( mf <= -0.010011 )
									ret := -0.517241
								if( mf > -0.010011 )
									ret := 0.200000
							if( ema2 > 0.040327 )
								if( mf <= 0.005737 )
									ret := -0.062500
								if( mf > 0.005737 )
									ret := 0.750000 // buy
						if( ema13 > 0.000862 )
							if( ema1 <= 0.083934 )
								if( ad_mf <= -1.32531e+07 )
									ret := -0.833333 // sell
								if( ad_mf > -1.32531e+07 )
									ret := -0.428571
							if( ema1 > 0.083934 )
								if( ad <= -1.31406e+07 )
									ret := 0.166667
								if( ad > -1.31406e+07 )
									ret := -0.428571
	if( ad > -1.30589e+07 )
		if( ad_mf <= -2.16998e+06 )
			if( ad_mf <= -1.29058e+07 )
				if( ad_mf <= -1.29786e+07 )
					if( mf <= 0.068603 )
						if( ad <= -1.29907e+07 )
							if( ad <= -1.30553e+07 )
								ret := -0.250000
							if( ad > -1.30553e+07 )
								if( ema3 <= 0.104369 )
									ret := 0.681818
								if( ema3 > 0.104369 )
									ret := -0.250000
						if( ad > -1.29907e+07 )
							ret := -0.200000
					if( mf > 0.068603 )
						if( ema3 <= 0.039921 )
							if( ad <= -1.30173e+07 )
								ret := -1.000000 // sell
							if( ad > -1.30173e+07 )
								if( ema12 <= 0.000112 )
									ret := -0.500000
								if( ema12 > 0.000112 )
									ret := -0.750000 // sell
						if( ema3 > 0.039921 )
							if( ad <= -1.30497e+07 )
								ret := 0.666667
							if( ad > -1.30497e+07 )
								if( mf <= 0.129473 )
									ret := -0.900000 // sell
								if( mf > 0.129473 )
									ret := -0.250000
				if( ad_mf > -1.29786e+07 )
					if( ema13 <= 0.000108 )
						if( ema13 <= -0.00015 )
							if( ad <= -1.2918e+07 )
								if( ema1 <= 0.020326 )
									ret := -1.000000 // sell
								if( ema1 > 0.020326 )
									ret := -0.444444
							if( ad > -1.2918e+07 )
								ret := -1.000000 // sell
						if( ema13 > -0.00015 )
							if( ad <= -1.29216e+07 )
								if( ema2 <= 0.027878 )
									ret := -0.250000
								if( ema2 > 0.027878 )
									ret := 0.000000
							if( ad > -1.29216e+07 )
								ret := -0.666667
					if( ema13 > 0.000108 )
						if( mf <= -0.054579 )
							ret := -0.500000
						if( mf > -0.054579 )
							if( ad_mf <= -1.2955e+07 )
								ret := -0.800000 // sell
							if( ad_mf > -1.2955e+07 )
								ret := -1.000000 // sell
			if( ad_mf > -1.29058e+07 )
				if( ad_mf <= -2.26118e+06 )
					if( ema13 <= 0.000857 )
						if( tema <= 0.157713 )
							if( ema12 <= -0.000129 )
								if( ad_mf <= -2.34448e+06 )
									ret := 0.118630
								if( ad_mf > -2.34448e+06 )
									ret := -0.461538
							if( ema12 > -0.000129 )
								if( ema1 <= 0.082499 )
									ret := 0.053750
								if( ema1 > 0.082499 )
									ret := -0.066485
						if( tema > 0.157713 )
							if( ad_mf <= -9.50787e+06 )
								if( ad_mf <= -1.18074e+07 )
									ret := -0.687500
								if( ad_mf > -1.18074e+07 )
									ret := 0.250000
							if( ad_mf > -9.50787e+06 )
								if( ema13 <= 0.000207 )
									ret := -0.469565
								if( ema13 > 0.000207 )
									ret := -0.076923
					if( ema13 > 0.000857 )
						if( ema12 <= 0.000332 )
							if( ema13 <= 0.001322 )
								if( ema2 <= 0.085307 )
									ret := 1.000000 // buy
								if( ema2 > 0.085307 )
									ret := 0.441176
							if( ema13 > 0.001322 )
								if( ad_mf <= -7.57729e+06 )
									ret := 1.000000 // buy
								if( ad_mf > -7.57729e+06 )
									ret := 0.750000 // buy
						if( ema12 > 0.000332 )
							if( ad <= -5.4242e+06 )
								if( ema13 <= 0.002097 )
									ret := 0.151938
								if( ema13 > 0.002097 )
									ret := -0.148352
							if( ad > -5.4242e+06 )
								if( ema2 <= 0.031036 )
									ret := -0.388889
								if( ema2 > 0.031036 )
									ret := 0.262735
				if( ad_mf > -2.26118e+06 )
					if( ema13 <= -0.001109 )
						ret := -1.000000 // sell
					if( ema13 > -0.001109 )
						if( ad_mf <= -2.23635e+06 )
							if( mf <= -0.028933 )
								if( ad_mf <= -2.24028e+06 )
									ret := -0.062500
								if( ad_mf > -2.24028e+06 )
									ret := 0.714286 // buy
							if( mf > -0.028933 )
								if( tema <= 0.034643 )
									ret := 0.483333
								if( tema > 0.034643 )
									ret := 0.820513 // buy
						if( ad_mf > -2.23635e+06 )
							if( ema13 <= 0.00038 )
								if( ad <= -2.18491e+06 )
									ret := 0.000000
								if( ad > -2.18491e+06 )
									ret := 0.388060
							if( ema13 > 0.00038 )
								if( ema2 <= 0.070661 )
									ret := 0.900000 // buy
								if( ema2 > 0.070661 )
									ret := 0.000000
		if( ad_mf > -2.16998e+06 )
			if( ema12 <= -8.9e-05 )
				if( tema <= 0.171592 )
					if( ad <= 9.21268e+07 )
						if( tema <= 0.044936 )
							if( ad_mf <= -2.16365e+06 )
								if( ema12 <= -0.000135 )
									ret := -1.000000 // sell
								if( ema12 > -0.000135 )
									ret := -0.750000 // sell
							if( ad_mf > -2.16365e+06 )
								if( ad_mf <= 9.06419e+07 )
									ret := 0.090619
								if( ad_mf > 9.06419e+07 )
									ret := -1.000000 // sell
						if( tema > 0.044936 )
							if( ema13 <= -0.000328 )
								if( ema13 <= -0.003657 )
									ret := 0.198697
								if( ema13 > -0.003657 )
									ret := 0.002206
							if( ema13 > -0.000328 )
								if( tema <= 0.053804 )
									ret := -0.039437
								if( tema > 0.053804 )
									ret := 0.158436
					if( ad > 9.21268e+07 )
						if( ad <= 1.41245e+08 )
							if( ema13 <= -0.000804 )
								if( ema1 <= 0.076913 )
									ret := 0.831169 // buy
								if( ema1 > 0.076913 )
									ret := 0.458824
							if( ema13 > -0.000804 )
								if( mf <= 0.172472 )
									ret := -0.592593
								if( mf > 0.172472 )
									ret := 0.857143 // buy
						if( ad > 1.41245e+08 )
							if( ad_mf <= 2.33515e+08 )
								if( tema <= 0.022741 )
									ret := 0.833333 // buy
								if( tema > 0.022741 )
									ret := -0.424242
							if( ad_mf > 2.33515e+08 )
								ret := 0.857143 // buy
				if( tema > 0.171592 )
					if( tema <= 0.225823 )
						if( ema13 <= -0.004693 )
							if( ema13 <= -0.011774 )
								if( ema2 <= 0.209371 )
									ret := -1.000000 // sell
								if( ema2 > 0.209371 )
									ret := -0.500000
							if( ema13 > -0.011774 )
								if( tema <= 0.218026 )
									ret := 0.355263
								if( tema > 0.218026 )
									ret := -0.266667
						if( ema13 > -0.004693 )
							if( mf <= 0.159391 )
								if( tema <= 0.222737 )
									ret := -0.331878
								if( tema > 0.222737 )
									ret := 0.375000
							if( mf > 0.159391 )
								if( ema13 <= -0.002984 )
									ret := 0.800000 // buy
								if( ema13 > -0.002984 )
									ret := 0.000000
					if( tema > 0.225823 )
						if( ema3 <= 0.240689 )
							if( ema1 <= 0.228814 )
								ret := -0.400000
							if( ema1 > 0.228814 )
								if( ad <= 1.86194e+07 )
									ret := -0.785714 // sell
								if( ad > 1.86194e+07 )
									ret := -1.000000 // sell
						if( ema3 > 0.240689 )
							if( ema2 <= 0.241968 )
								ret := 0.166667
							if( ema2 > 0.241968 )
								if( ema3 <= 0.248657 )
									ret := -1.000000 // sell
								if( ema3 > 0.248657 )
									ret := -0.500000
			if( ema12 > -8.9e-05 )
				if( ad <= 1.40396e+08 )
					if( ema13 <= 7.7e-05 )
						if( ad <= 1.38577e+07 )
							if( ad_mf <= 9.71417e+06 )
								if( ad <= 9.70493e+06 )
									ret := -0.006133
								if( ad > 9.70493e+06 )
									ret := -1.000000 // sell
							if( ad_mf > 9.71417e+06 )
								if( ad_mf <= 1.38255e+07 )
									ret := 0.105802
								if( ad_mf > 1.38255e+07 )
									ret := 1.000000 // buy
						if( ad > 1.38577e+07 )
							if( mf <= 0.216851 )
								if( ad_mf <= 2.42467e+07 )
									ret := -0.178490
								if( ad_mf > 2.42467e+07 )
									ret := -0.002813
							if( mf > 0.216851 )
								if( ad <= 1.96292e+07 )
									ret := -0.100000
								if( ad > 1.96292e+07 )
									ret := 0.764706 // buy
					if( ema13 > 7.7e-05 )
						if( ema12 <= 0.001199 )
							if( ema13 <= 0.002101 )
								if( ad_mf <= 1.30371e+08 )
									ret := 0.030043
								if( ad_mf > 1.30371e+08 )
									ret := 0.833333 // buy
							if( ema13 > 0.002101 )
								if( ad <= 4.65999e+07 )
									ret := 0.206250
								if( ad > 4.65999e+07 )
									ret := 0.771429 // buy
						if( ema12 > 0.001199 )
							if( ema1 <= 0.145798 )
								if( ema3 <= 0.11978 )
									ret := -0.054496
								if( ema3 > 0.11978 )
									ret := -0.271523
							if( ema1 > 0.145798 )
								if( ema2 <= 0.164572 )
									ret := 0.301370
								if( ema2 > 0.164572 )
									ret := -0.036789
				if( ad > 1.40396e+08 )
					if( ema3 <= 0.123931 )
						if( ad_mf <= 1.9871e+08 )
							if( ema1 <= 0.071041 )
								if( ema2 <= 0.042878 )
									ret := -0.903226 // sell
								if( ema2 > 0.042878 )
									ret := -0.647059
							if( ema1 > 0.071041 )
								if( ad_mf <= 1.82026e+08 )
									ret := 0.000000
								if( ad_mf > 1.82026e+08 )
									ret := -1.000000 // sell
						if( ad_mf > 1.9871e+08 )
							if( ema12 <= 0.001902 )
								if( ad <= 2.11744e+08 )
									ret := 1.000000 // buy
								if( ad > 2.11744e+08 )
									ret := 0.125000
							if( ema12 > 0.001902 )
								if( ad_mf <= 2.29196e+08 )
									ret := -0.750000 // sell
								if( ad_mf > 2.29196e+08 )
									ret := -1.000000 // sell
					if( ema3 > 0.123931 )
						if( ema13 <= 0.00602 )
							ret := 1.000000 // buy
						if( ema13 > 0.00602 )
							ret := -0.800000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_VETUSDT_30Min_e0d5de08(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)

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


