//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: TTD_15Min_2BV0_d67825ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2BV0_d67825ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_d67825ad(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( VIP_VIM <= -0.759443 )
			if( VIP <= 0.563455 )
				if( VIP_VIM <= -1.27972 )
					ret := -0.722222 // sell
				if( VIP_VIM > -1.27972 )
					if( bbp <= -12.7515 )
						if( VIP_VIM <= -0.982036 )
							if( bbm <= 9.27155 )
								ret := -1.000000 // sell
							if( bbm > 9.27155 )
								ret := -0.142857
						if( VIP_VIM > -0.982036 )
							if( VIM <= 1.41899 )
								ret := 0.000000
							if( VIM > 1.41899 )
								if( bbp <= -54.5963 )
									ret := -0.903226 // sell
								if( bbp > -54.5963 )
									ret := -0.366667
					if( bbp > -12.7515 )
						if( bbm <= 1.36932 )
							if( bbp <= -5.74679 )
								if( VIP <= 0.528052 )
									ret := -0.181818
								if( VIP > 0.528052 )
									ret := 1.000000 // buy
							if( bbp > -5.74679 )
								if( VIM <= 1.54225 )
									ret := -0.378378
								if( VIM > 1.54225 )
									ret := 0.026316
						if( bbm > 1.36932 )
							if( bearPower <= -2.4726 )
								if( bbp <= -9.80776 )
									ret := 0.214286
								if( bbp > -9.80776 )
									ret := 0.776119 // buy
							if( bearPower > -2.4726 )
								ret := -0.500000
			if( VIP > 0.563455 )
				if( bearPower <= -9.13311 )
					if( bbm <= 10.809 )
						if( VIM <= 1.65421 )
							if( VIP <= 0.633493 )
								if( bearPower <= -20.0372 )
									ret := -0.714286 // sell
								if( bearPower > -20.0372 )
									ret := -0.171429
							if( VIP > 0.633493 )
								if( VIP_VIM <= -0.780194 )
									ret := 0.063492
								if( VIP_VIM > -0.780194 )
									ret := 0.733333 // buy
						if( VIM > 1.65421 )
							if( bbp <= -23.5716 )
								if( bullPower <= -20.982 )
									ret := 1.000000 // buy
								if( bullPower > -20.982 )
									ret := -0.785714 // sell
							if( bbp > -23.5716 )
								ret := 0.187500
					if( bbm > 10.809 )
						if( VIM <= 1.4145 )
							ret := -0.416667
						if( VIM > 1.4145 )
							if( bullPower <= -21.5649 )
								ret := 1.000000 // buy
							if( bullPower > -21.5649 )
								if( bearPower <= -30.6787 )
									ret := 0.200000
								if( bearPower > -30.6787 )
									ret := 0.777778 // buy
				if( bearPower > -9.13311 )
					if( bullPower <= -2.1584 )
						if( VIP_VIM <= -0.77156 )
							if( bearPower <= -3.28937 )
								if( VIP <= 0.771455 )
									ret := 0.331818
								if( VIP > 0.771455 )
									ret := 0.674419
							if( bearPower > -3.28937 )
								if( bbp <= -5.06184 )
									ret := -0.461538
								if( bbp > -5.06184 )
									ret := -0.076923
						if( VIP_VIM > -0.77156 )
							if( bullPower <= -2.63903 )
								if( bullPower <= -3.43227 )
									ret := 1.000000 // buy
								if( bullPower > -3.43227 )
									ret := 0.083333
							if( bullPower > -2.63903 )
								ret := 1.000000 // buy
					if( bullPower > -2.1584 )
						if( VIM <= 2.22066 )
							if( bearPower <= -1.22962 )
								if( VIM <= 1.50455 )
									ret := -0.055749
								if( VIM > 1.50455 )
									ret := 0.266272
							if( bearPower > -1.22962 )
								if( bullPower <= -0.618506 )
									ret := 0.237805
								if( bullPower > -0.618506 )
									ret := 0.484009
						if( VIM > 2.22066 )
							if( bullPower <= -0.307331 )
								if( VIP_VIM <= -1.04436 )
									ret := 0.120968
								if( VIP_VIM > -1.04436 )
									ret := 0.358974
							if( bullPower > -0.307331 )
								if( VIP_VIM <= -1.10267 )
									ret := 0.298246
								if( VIP_VIM > -1.10267 )
									ret := -0.536424
		if( VIP_VIM > -0.759443 )
			if( bullPower <= -0.099752 )
				if( bearPower <= -1.26127 )
					if( bullPower <= -1.04012 )
						if( bearPower <= -3.30534 )
							if( bbp <= -5.51796 )
								if( bearPower <= -15.5453 )
									ret := -0.171076
								if( bearPower > -15.5453 )
									ret := 0.053411
							if( bbp > -5.51796 )
								if( bearPower <= -3.50223 )
									ret := -0.166667
								if( bearPower > -3.50223 )
									ret := -0.450331
						if( bearPower > -3.30534 )
							if( VIP_VIM <= -0.011662 )
								if( bullPower <= -2.59362 )
									ret := 0.597015
								if( bullPower > -2.59362 )
									ret := 0.100607
							if( VIP_VIM > -0.011662 )
								if( VIM <= 2.07037 )
									ret := 0.500000
								if( VIM > 2.07037 )
									ret := -0.235294
					if( bullPower > -1.04012 )
						if( VIM <= 1.90653 )
							if( bullPower <= -0.104833 )
								if( VIP_VIM <= 0.024424 )
									ret := -0.072330
								if( VIP_VIM > 0.024424 )
									ret := 0.278607
							if( bullPower > -0.104833 )
								ret := 0.777778 // buy
						if( VIM > 1.90653 )
							if( VIM <= 2.82876 )
								if( bbp <= -3.29314 )
									ret := -1.000000 // sell
								if( bbp > -3.29314 )
									ret := -0.739130 // sell
							if( VIM > 2.82876 )
								if( bbp <= -2.76782 )
									ret := -0.636364
								if( bbp > -2.76782 )
									ret := 0.705882 // buy
				if( bearPower > -1.26127 )
					if( bbm <= 0.004551 )
						if( bullPower <= -0.523384 )
							if( VIP_VIM <= -0.115023 )
								if( VIP_VIM <= -0.709541 )
									ret := -0.307692
								if( VIP_VIM > -0.709541 )
									ret := 0.279503
							if( VIP_VIM > -0.115023 )
								if( bullPower <= -0.901582 )
									ret := 0.756250 // buy
								if( bullPower > -0.901582 )
									ret := 0.376855
						if( bullPower > -0.523384 )
							if( bearPower <= -0.443114 )
								if( bbp <= -0.896742 )
									ret := -0.004739
								if( bbp > -0.896742 )
									ret := -0.869565 // sell
							if( bearPower > -0.443114 )
								if( bullPower <= -0.419229 )
									ret := 0.445783
								if( bullPower > -0.419229 )
									ret := 0.137844
					if( bbm > 0.004551 )
						if( VIM <= 2.27698 )
							if( VIP <= 2.2839 )
								if( bearPower <= -0.133503 )
									ret := 0.082425
								if( bearPower > -0.133503 )
									ret := -0.619048
							if( VIP > 2.2839 )
								if( bbp <= -1.41379 )
									ret := 0.250000
								if( bbp > -1.41379 )
									ret := 0.839286 // buy
						if( VIM > 2.27698 )
							if( VIP <= 2.90468 )
								if( bearPower <= -0.278701 )
									ret := -0.360825
								if( bearPower > -0.278701 )
									ret := -0.875000 // sell
							if( VIP > 2.90468 )
								if( bbm <= 0.084383 )
									ret := 0.046875
								if( bbm > 0.084383 )
									ret := 0.510870
			if( bullPower > -0.099752 )
				if( VIP_VIM <= -0.65296 )
					if( bbm <= 9.57838 )
						if( VIP_VIM <= -0.750833 )
							ret := -0.083333
						if( VIP_VIM > -0.750833 )
							if( bearPower <= -0.154463 )
								if( bullPower <= 0.377295 )
									ret := 0.747573 // buy
								if( bullPower > 0.377295 )
									ret := 0.095238
							if( bearPower > -0.154463 )
								if( VIP <= 1.27245 )
									ret := 0.000000
								if( VIP > 1.27245 )
									ret := 0.461538
					if( bbm > 9.57838 )
						ret := -0.285714
				if( VIP_VIM > -0.65296 )
					if( VIP <= 1.13249 )
						if( bullPower <= 5.28668 )
							if( bullPower <= 0.723622 )
								if( bbm <= 2.02539 )
									ret := -0.044670
								if( bbm > 2.02539 )
									ret := 0.131659
							if( bullPower > 0.723622 )
								if( VIM <= 0.868191 )
									ret := 0.381818
								if( VIM > 0.868191 )
									ret := -0.151012
						if( bullPower > 5.28668 )
							if( VIP <= 1.04898 )
								if( bbm <= 16.8 )
									ret := 0.944444 // buy
								if( bbm > 16.8 )
									ret := 0.400000
							if( VIP > 1.04898 )
								ret := 0.000000
					if( VIP > 1.13249 )
						if( bbm <= 6.86382 )
							if( bbm <= 0.002299 )
								if( VIP <= 1.27577 )
									ret := 0.312030
								if( VIP > 1.27577 )
									ret := 0.112613
							if( bbm > 0.002299 )
								if( bbm <= 6.70523 )
									ret := 0.002934
								if( bbm > 6.70523 )
									ret := -0.857143 // sell
						if( bbm > 6.86382 )
							if( bearPower <= -7.11572 )
								if( bbp <= -11.5885 )
									ret := -0.272727
								if( bbp > -11.5885 )
									ret := 0.603448
							if( bearPower > -7.11572 )
								if( VIP_VIM <= -0.040917 )
									ret := -0.074074
								if( VIP_VIM > -0.040917 )
									ret := 0.421053
	if( BBPower_Color > 0.5 )
		if( bearPower <= 1.14725 )
			if( VIP <= 1.37052 )
				if( VIP <= 0.967755 )
					if( bearPower <= -0.308199 )
						if( bullPower <= 7.20523 )
							if( bearPower <= -0.554922 )
								if( bbm <= 1.38525 )
									ret := -0.900000 // sell
								if( bbm > 1.38525 )
									ret := -0.089286
							if( bearPower > -0.554922 )
								if( bullPower <= 0.777637 )
									ret := 0.036082
								if( bullPower > 0.777637 )
									ret := 0.380000
						if( bullPower > 7.20523 )
							if( bullPower <= 14.4573 )
								if( bbp <= 4.96425 )
									ret := 0.782609 // buy
								if( bbp > 4.96425 )
									ret := 0.384615
							if( bullPower > 14.4573 )
								ret := -0.166667
					if( bearPower > -0.308199 )
						if( bbm <= 1.01681 )
							if( bearPower <= -0.271792 )
								if( bbm <= 0.6795 )
									ret := 0.000000
								if( bbm > 0.6795 )
									ret := -0.857143 // sell
							if( bearPower > -0.271792 )
								if( bbp <= 1.28849 )
									ret := -0.207382
								if( bbp > 1.28849 )
									ret := 0.314286
						if( bbm > 1.01681 )
							if( bbp <= 2.31731 )
								if( bearPower <= 0.419265 )
									ret := 0.373239
								if( bearPower > 0.419265 )
									ret := 0.800000 // buy
							if( bbp > 2.31731 )
								if( VIP_VIM <= -0.228618 )
									ret := 0.555556
								if( VIP_VIM > -0.228618 )
									ret := -0.250000
				if( VIP > 0.967755 )
					if( bbp <= 19.9366 )
						if( bbm <= 13.717 )
							if( VIP_VIM <= -0.73376 )
								if( bearPower <= 0.273721 )
									ret := -0.222222
								if( bearPower > 0.273721 )
									ret := -0.800000 // sell
							if( VIP_VIM > -0.73376 )
								if( VIP <= 1.24021 )
									ret := -0.024070
								if( VIP > 1.24021 )
									ret := 0.017789
						if( bbm > 13.717 )
							if( bearPower <= -7.82308 )
								if( bullPower <= 17.3428 )
									ret := -0.944444 // sell
								if( bullPower > 17.3428 )
									ret := -0.333333
							if( bearPower > -7.82308 )
								if( bearPower <= -0.951514 )
									ret := 0.782178 // buy
								if( bearPower > -0.951514 )
									ret := -0.777778 // sell
					if( bbp > 19.9366 )
						ret := -1.000000 // sell
			if( VIP > 1.37052 )
				if( bbm <= 6.1725 )
					if( VIM <= 0.811292 )
						if( bearPower <= 0.941434 )
							if( bbp <= 3.07309 )
								if( bbp <= 1.4972 )
									ret := 0.015015
								if( bbp > 1.4972 )
									ret := 0.208138
							if( bbp > 3.07309 )
								if( VIP <= 1.43051 )
									ret := -0.923077 // sell
								if( VIP > 1.43051 )
									ret := -0.500000
						if( bearPower > 0.941434 )
							if( bbp <= 2.59155 )
								if( bearPower <= 1.09657 )
									ret := -0.562500
								if( bearPower > 1.09657 )
									ret := -0.153846
							if( bbp > 2.59155 )
								if( VIP <= 1.39267 )
									ret := -0.789474 // sell
								if( VIP > 1.39267 )
									ret := 0.013158
					if( VIM > 0.811292 )
						if( VIP <= 1.47134 )
							if( bullPower <= 0.100848 )
								if( bbp <= 0.041742 )
									ret := 0.133333
								if( bbp > 0.041742 )
									ret := -0.684685
							if( bullPower > 0.100848 )
								if( bearPower <= 0.543264 )
									ret := -0.169680
								if( bearPower > 0.543264 )
									ret := -0.533186
						if( VIP > 1.47134 )
							if( bbm <= 3.87134 )
								if( VIP <= 2.63283 )
									ret := -0.038272
								if( VIP > 2.63283 )
									ret := -0.230769
							if( bbm > 3.87134 )
								if( bbm <= 5.63154 )
									ret := 0.522727
								if( bbm > 5.63154 )
									ret := 0.000000
				if( bbm > 6.1725 )
					if( VIP <= 1.51009 )
						if( VIP_VIM <= 0.698678 )
							if( bbm <= 12.94 )
								if( bbm <= 9.00048 )
									ret := -0.461538
								if( bbm > 9.00048 )
									ret := -0.962264 // sell
							if( bbm > 12.94 )
								if( VIP <= 1.41572 )
									ret := 0.166667
								if( VIP > 1.41572 )
									ret := -0.666667
						if( VIP_VIM > 0.698678 )
							ret := 0.333333
					if( VIP > 1.51009 )
						if( bullPower <= 8.91499 )
							if( VIP_VIM <= 0.175296 )
								ret := 0.428571
							if( VIP_VIM > 0.175296 )
								if( VIM <= 1.04497 )
									ret := 0.833333 // buy
								if( VIM > 1.04497 )
									ret := -0.739726 // sell
						if( bullPower > 8.91499 )
							if( bullPower <= 9.70531 )
								ret := 0.714286 // buy
							if( bullPower > 9.70531 )
								if( VIP_VIM <= 0.634307 )
									ret := 0.461538
								if( VIP_VIM > 0.634307 )
									ret := -0.625000
		if( bearPower > 1.14725 )
			if( VIM <= 0.567343 )
				if( VIM <= 0.454816 )
					if( VIP_VIM <= 1.00214 )
						ret := -0.333333
					if( VIP_VIM > 1.00214 )
						if( VIP_VIM <= 1.09394 )
							if( VIP_VIM <= 1.05846 )
								ret := 0.333333
							if( VIP_VIM > 1.05846 )
								ret := 0.666667
						if( VIP_VIM > 1.09394 )
							if( bearPower <= 2.9273 )
								if( bbm <= 0.616255 )
									ret := 0.000000
								if( bbm > 0.616255 )
									ret := -0.384615
							if( bearPower > 2.9273 )
								if( VIP_VIM <= 1.16337 )
									ret := 0.571429
								if( VIP_VIM > 1.16337 )
									ret := 0.000000
				if( VIM > 0.454816 )
					if( VIP_VIM <= 1.13753 )
						if( bbp <= 9.1858 )
							if( VIP <= 1.5018 )
								if( VIP_VIM <= 0.913126 )
									ret := 0.333333
								if( VIP_VIM > 0.913126 )
									ret := 0.021505
							if( VIP > 1.5018 )
								if( bbm <= 1.15496 )
									ret := 0.699029
								if( bbm > 1.15496 )
									ret := 0.000000
						if( bbp > 9.1858 )
							if( VIM <= 0.541359 )
								if( bbm <= 2.52382 )
									ret := 0.558140
								if( bbm > 2.52382 )
									ret := 0.841463 // buy
							if( VIM > 0.541359 )
								if( VIP <= 1.42426 )
									ret := 0.850000 // buy
								if( VIP > 1.42426 )
									ret := 0.307692
					if( VIP_VIM > 1.13753 )
						ret := -0.052632
			if( VIM > 0.567343 )
				if( VIP_VIM <= -0.185264 )
					if( VIP <= 1.45886 )
						if( bbp <= 2.68536 )
							if( VIP_VIM <= -0.407678 )
								if( bbp <= 2.50727 )
									ret := -1.000000 // sell
								if( bbp > 2.50727 )
									ret := -0.750000 // sell
							if( VIP_VIM > -0.407678 )
								if( VIM <= 1.61616 )
									ret := -1.000000 // sell
								if( VIM > 1.61616 )
									ret := -0.384615
						if( bbp > 2.68536 )
							if( bearPower <= 1.36339 )
								if( VIP <= 1.27892 )
									ret := 0.700000 // buy
								if( VIP > 1.27892 )
									ret := 0.066667
							if( bearPower > 1.36339 )
								if( VIP <= 1.1296 )
									ret := -0.212121
								if( VIP > 1.1296 )
									ret := -0.555556
					if( VIP > 1.45886 )
						if( VIP <= 2.25746 )
							if( bbp <= 3.87724 )
								if( VIP_VIM <= -0.362401 )
									ret := 0.689655
								if( VIP_VIM > -0.362401 )
									ret := -0.230769
							if( bbp > 3.87724 )
								if( VIM <= 1.85678 )
									ret := -0.818182 // sell
								if( VIM > 1.85678 )
									ret := 0.023810
						if( VIP > 2.25746 )
							if( bullPower <= 1.73973 )
								ret := 0.307692
							if( bullPower > 1.73973 )
								if( VIP <= 2.66217 )
									ret := -0.285714
								if( VIP > 2.66217 )
									ret := -0.722222 // sell
				if( VIP_VIM > -0.185264 )
					if( VIP_VIM <= 1.12655 )
						if( bearPower <= 6.16885 )
							if( bullPower <= 5.24222 )
								if( bearPower <= 3.09271 )
									ret := 0.060824
								if( bearPower > 3.09271 )
									ret := 0.312500
							if( bullPower > 5.24222 )
								if( VIP <= 1.30583 )
									ret := -0.181529
								if( VIP > 1.30583 )
									ret := 0.034343
						if( bearPower > 6.16885 )
							if( bbm <= 14.264 )
								if( bullPower <= 6.35163 )
									ret := -0.960000 // sell
								if( bullPower > 6.35163 )
									ret := -0.127371
							if( bbm > 14.264 )
								if( VIP_VIM <= 0.701365 )
									ret := 0.964286 // buy
								if( VIP_VIM > 0.701365 )
									ret := -0.090909
					if( VIP_VIM > 1.12655 )
						if( VIM <= 0.65253 )
							ret := -0.666667
						if( VIM > 0.65253 )
							if( bbm <= 0.175 )
								ret := -0.076923
							if( bbm > 0.175 )
								if( bullPower <= 10.0895 )
									ret := 0.924242 // buy
								if( bullPower > 10.0895 )
									ret := 0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_TTD_15Min_d67825ad(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


