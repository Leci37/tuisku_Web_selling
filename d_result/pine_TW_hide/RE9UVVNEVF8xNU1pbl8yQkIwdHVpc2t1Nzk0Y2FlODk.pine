//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: DOTUSDT_15Min_2BB0_794cae89 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2BB0_794cae89", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_794cae89(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Lower_Band <= 10.7959 )
		if( bearPower <= -0.066823 )
			if( Lower_Band <= 6.70453 )
				if( bbp <= -0.163133 )
					if( bearPower <= -0.180849 )
						if( bbm <= 0.099732 )
							if( bearPower <= -0.24194 )
								if( basis <= 5.7335 )
									ret := -0.300000
								if( basis > 5.7335 )
									ret := 0.687500
							if( bearPower > -0.24194 )
								if( Lower_Band <= 6.26473 )
									ret := 0.905660 // buy
								if( Lower_Band > 6.26473 )
									ret := 0.673469
						if( bbm > 0.099732 )
							if( bearPower <= -0.213209 )
								if( basis <= 6.92342 )
									ret := 0.248521
								if( basis > 6.92342 )
									ret := 0.857143 // buy
							if( bearPower > -0.213209 )
								if( bbp <= -0.269768 )
									ret := 0.979167 // buy
								if( bbp > -0.269768 )
									ret := 0.614035
					if( bearPower > -0.180849 )
						if( basis <= 6.52345 )
							if( bbm <= 0.109442 )
								if( Lower_Band <= 3.90939 )
									ret := -0.954545 // sell
								if( Lower_Band > 3.90939 )
									ret := 0.317440
							if( bbm > 0.109442 )
								if( bbm <= 0.133644 )
									ret := -0.156863
								if( bbm > 0.133644 )
									ret := -0.842105 // sell
						if( basis > 6.52345 )
							if( bbp <= -0.230236 )
								if( basis <= 6.8522 )
									ret := 0.611111
								if( basis > 6.8522 )
									ret := -0.294118
							if( bbp > -0.230236 )
								if( Lower_Band <= 6.41369 )
									ret := 0.941176 // buy
								if( Lower_Band > 6.41369 )
									ret := 0.658065
				if( bbp > -0.163133 )
					if( bbp <= -0.159183 )
						if( bbp <= -0.161235 )
							if( bbp <= -0.162249 )
								if( Upper_Band <= 6.24514 )
									ret := -0.333333
								if( Upper_Band > 6.24514 )
									ret := -0.400000
							if( bbp > -0.162249 )
								ret := 0.500000
						if( bbp > -0.161235 )
							if( basis <= 6.49272 )
								if( Upper_Band <= 6.30939 )
									ret := -0.727273 // sell
								if( Upper_Band > 6.30939 )
									ret := -0.461538
							if( basis > 6.49272 )
								ret := -0.923077 // sell
					if( bbp > -0.159183 )
						if( bearPower <= -0.103545 )
							if( Upper_Band <= 6.86114 )
								if( bullPower <= 0.063898 )
									ret := 0.183505
								if( bullPower > 0.063898 )
									ret := 0.920000 // buy
							if( Upper_Band > 6.86114 )
								if( bbm <= 0.118355 )
									ret := 0.902439 // buy
								if( bbm > 0.118355 )
									ret := 0.318182
						if( bearPower > -0.103545 )
							if( bbp <= -0.1251 )
								if( Lower_Band <= 4.52149 )
									ret := -0.370787
								if( Lower_Band > 4.52149 )
									ret := 0.072464
							if( bbp > -0.1251 )
								if( Upper_Band <= 4.5897 )
									ret := 0.585000
								if( Upper_Band > 4.5897 )
									ret := 0.126239
			if( Lower_Band > 6.70453 )
				if( Upper_Band <= 11.3305 )
					if( basis <= 6.80488 )
						if( bbm <= 0.052152 )
							ret := 1.000000 // buy
						if( bbm > 0.052152 )
							if( bbm <= 0.071689 )
								ret := 0.090909
							if( bbm > 0.071689 )
								if( bearPower <= -0.07983 )
									ret := 0.375000
								if( bearPower > -0.07983 )
									ret := 1.000000 // buy
					if( basis > 6.80488 )
						if( Upper_Band <= 6.94315 )
							if( bbm <= 0.050366 )
								if( bbm <= 0.039752 )
									ret := -0.200000
								if( bbm > 0.039752 )
									ret := 0.333333
							if( bbm > 0.050366 )
								if( Upper_Band <= 6.90177 )
									ret := 0.125000
								if( Upper_Band > 6.90177 )
									ret := -0.655738
						if( Upper_Band > 6.94315 )
							if( basis <= 6.92156 )
								if( bullPower <= -0.051289 )
									ret := 0.111111
								if( bullPower > -0.051289 )
									ret := 0.607143
							if( basis > 6.92156 )
								if( Lower_Band <= 6.79632 )
									ret := -0.493151
								if( Lower_Band > 6.79632 )
									ret := 0.088405
				if( Upper_Band > 11.3305 )
					if( basis <= 10.2838 )
						ret := -1.000000 // sell
					if( basis > 10.2838 )
						if( Lower_Band <= 10.7412 )
							if( Upper_Band <= 11.9689 )
								if( Lower_Band <= 8.90512 )
									ret := 0.166667
								if( Lower_Band > 8.90512 )
									ret := 0.786667 // buy
							if( Upper_Band > 11.9689 )
								if( bullPower <= -0.220887 )
									ret := 0.600000
								if( bullPower > -0.220887 )
									ret := -0.700000 // sell
						if( Lower_Band > 10.7412 )
							if( bullPower <= -0.130419 )
								ret := 0.818182 // buy
							if( bullPower > -0.130419 )
								ret := 1.000000 // buy
		if( bearPower > -0.066823 )
			if( Lower_Band <= 6.95514 )
				if( basis <= 7.09899 )
					if( bbm <= 0.015564 )
						if( Upper_Band <= 3.78154 )
							if( basis <= 3.74905 )
								if( Lower_Band <= 3.66637 )
									ret := -0.009302
								if( Lower_Band > 3.66637 )
									ret := 0.136232
							if( basis > 3.74905 )
								if( Upper_Band <= 3.7655 )
									ret := 0.840000 // buy
								if( Upper_Band > 3.7655 )
									ret := 0.362069
						if( Upper_Band > 3.78154 )
							if( bullPower <= 0.031506 )
								if( bullPower <= -0.000215 )
									ret := -0.072358
								if( bullPower > -0.000215 )
									ret := -0.018882
							if( bullPower > 0.031506 )
								if( bearPower <= 0.03822 )
									ret := 0.241279
								if( bearPower > 0.03822 )
									ret := -0.464286
					if( bbm > 0.015564 )
						if( Upper_Band <= 4.25662 )
							if( Lower_Band <= 4.20481 )
								if( bearPower <= -0.011604 )
									ret := 0.240193
								if( bearPower > -0.011604 )
									ret := 0.059848
							if( Lower_Band > 4.20481 )
								if( basis <= 4.23269 )
									ret := -0.470588
								if( basis > 4.23269 )
									ret := -0.727273 // sell
						if( Upper_Band > 4.25662 )
							if( Upper_Band <= 4.27443 )
								if( bbp <= 0.084391 )
									ret := -0.235043
								if( bbp > 0.084391 )
									ret := -1.000000 // sell
							if( Upper_Band > 4.27443 )
								if( bearPower <= -0.04506 )
									ret := 0.104071
								if( bearPower > -0.04506 )
									ret := 0.004116
				if( basis > 7.09899 )
					if( Lower_Band <= 6.81449 )
						if( bbm <= 0.094061 )
							if( bbm <= 0.077485 )
								if( bullPower <= 0.058711 )
									ret := 0.727273 // buy
								if( bullPower > 0.058711 )
									ret := 0.850000 // buy
							if( bbm > 0.077485 )
								ret := -0.200000
						if( bbm > 0.094061 )
							ret := 1.000000 // buy
					if( Lower_Band > 6.81449 )
						if( Upper_Band <= 7.59652 )
							if( Lower_Band <= 6.8427 )
								ret := -0.538462
							if( Lower_Band > 6.8427 )
								if( bbm <= 0.055999 )
									ret := 0.618644
								if( bbm > 0.055999 )
									ret := -0.012500
						if( Upper_Band > 7.59652 )
							ret := -0.800000 // sell
			if( Lower_Band > 6.95514 )
				if( bearPower <= -0.014581 )
					if( bearPower <= -0.020735 )
						if( bbm <= 0.029794 )
							if( bbm <= 0.02937 )
								if( basis <= 7.03982 )
									ret := 0.285714
								if( basis > 7.03982 )
									ret := -0.150959
							if( bbm > 0.02937 )
								if( Lower_Band <= 7.5995 )
									ret := -0.939394 // sell
								if( Lower_Band > 7.5995 )
									ret := -0.600000
						if( bbm > 0.029794 )
							if( Lower_Band <= 7.84278 )
								if( Upper_Band <= 7.95057 )
									ret := -0.091622
								if( Upper_Band > 7.95057 )
									ret := -0.426829
							if( Lower_Band > 7.84278 )
								if( basis <= 8.32348 )
									ret := 0.389302
								if( basis > 8.32348 )
									ret := 0.009014
					if( bearPower > -0.020735 )
						if( basis <= 7.1165 )
							if( basis <= 7.07043 )
								if( Lower_Band <= 7.02655 )
									ret := -0.089109
								if( Lower_Band > 7.02655 )
									ret := 0.857143 // buy
							if( basis > 7.07043 )
								if( bearPower <= -0.017164 )
									ret := -0.375000
								if( bearPower > -0.017164 )
									ret := -0.715909 // sell
						if( basis > 7.1165 )
							if( Lower_Band <= 7.1375 )
								if( basis <= 7.12342 )
									ret := 1.000000 // buy
								if( basis > 7.12342 )
									ret := 0.288235
							if( Lower_Band > 7.1375 )
								if( bbp <= -0.014786 )
									ret := -0.267857
								if( bbp > -0.014786 )
									ret := 0.100064
				if( bearPower > -0.014581 )
					if( bbp <= 0.439307 )
						if( basis <= 7.02557 )
							if( bbm <= 0.019075 )
								if( bbm <= 0.0175 )
									ret := 0.029412
								if( bbm > 0.0175 )
									ret := -0.111111
							if( bbm > 0.019075 )
								if( bullPower <= 0.01383 )
									ret := -0.400000
								if( bullPower > 0.01383 )
									ret := -0.726415 // sell
						if( basis > 7.02557 )
							if( Upper_Band <= 7.09674 )
								if( bearPower <= 0.007697 )
									ret := 0.529412
								if( bearPower > 0.007697 )
									ret := -0.136364
							if( Upper_Band > 7.09674 )
								if( bullPower <= 0.059076 )
									ret := -0.077816
								if( bullPower > 0.059076 )
									ret := -0.148784
					if( bbp > 0.439307 )
						if( bearPower <= 0.271522 )
							if( Upper_Band <= 8.98319 )
								if( basis <= 8.39535 )
									ret := 0.076923
								if( basis > 8.39535 )
									ret := -1.000000 // sell
							if( Upper_Band > 8.98319 )
								if( bullPower <= 0.612615 )
									ret := 0.401384
								if( bullPower > 0.612615 )
									ret := -1.000000 // sell
						if( bearPower > 0.271522 )
							if( basis <= 10.4995 )
								if( bullPower <= 0.472898 )
									ret := 1.000000 // buy
								if( bullPower > 0.472898 )
									ret := 0.727273 // buy
							if( basis > 10.4995 )
								ret := -0.200000
	if( Lower_Band > 10.7959 )
		if( basis <= 13.2253 )
			if( basis <= 11.463 )
				if( bullPower <= 0.196201 )
					if( bbp <= -0.258332 )
						if( Upper_Band <= 11.6871 )
							if( basis <= 11.2423 )
								if( bearPower <= -0.216473 )
									ret := -0.363636
								if( bearPower > -0.216473 )
									ret := 0.818182 // buy
							if( basis > 11.2423 )
								if( bullPower <= -0.092622 )
									ret := 0.000000
								if( bullPower > -0.092622 )
									ret := -1.000000 // sell
						if( Upper_Band > 11.6871 )
							ret := 0.894737 // buy
					if( bbp > -0.258332 )
						if( bbm <= 0.06829 )
							if( bullPower <= 0.082179 )
								if( bearPower <= -0.062615 )
									ret := 0.416667
								if( bearPower > -0.062615 )
									ret := -0.188679
							if( bullPower > 0.082179 )
								ret := 0.692308
						if( bbm > 0.06829 )
							if( bearPower <= 0.040665 )
								if( bbm <= 0.188827 )
									ret := -0.498270
								if( bbm > 0.188827 )
									ret := -0.181818
							if( bearPower > 0.040665 )
								ret := 0.444444
				if( bullPower > 0.196201 )
					if( Lower_Band <= 10.8577 )
						if( Lower_Band <= 10.8218 )
							if( basis <= 11.2315 )
								ret := -0.857143 // sell
							if( basis > 11.2315 )
								ret := -0.444444
						if( Lower_Band > 10.8218 )
							if( Upper_Band <= 11.6962 )
								if( bbp <= 0.26205 )
									ret := -1.000000 // sell
								if( bbp > 0.26205 )
									ret := -0.692308
							if( Upper_Band > 11.6962 )
								ret := -1.000000 // sell
					if( Lower_Band > 10.8577 )
						ret := -0.444444
			if( basis > 11.463 )
				if( Upper_Band <= 12.056 )
					if( bullPower <= -0.043502 )
						if( bullPower <= -0.104974 )
							if( basis <= 11.633 )
								ret := -0.833333 // sell
							if( basis > 11.633 )
								ret := -1.000000 // sell
						if( bullPower > -0.104974 )
							ret := -1.000000 // sell
					if( bullPower > -0.043502 )
						if( bearPower <= -0.180834 )
							ret := -0.454545
						if( bearPower > -0.180834 )
							if( bullPower <= 0.056677 )
								ret := -1.000000 // sell
							if( bullPower > 0.056677 )
								if( bullPower <= 0.120714 )
									ret := -0.800000 // sell
								if( bullPower > 0.120714 )
									ret := -0.947368 // sell
				if( Upper_Band > 12.056 )
					if( Lower_Band <= 11.5157 )
						if( bbp <= 0.09051 )
							if( BBPower_Color <= 0.5 )
								if( Lower_Band <= 11.4449 )
									ret := 0.111111
								if( Lower_Band > 11.4449 )
									ret := -1.000000 // sell
							if( BBPower_Color > 0.5 )
								ret := 1.000000 // buy
						if( bbp > 0.09051 )
							if( bearPower <= 0.087501 )
								if( bbp <= 0.215783 )
									ret := -0.578947
								if( bbp > 0.215783 )
									ret := -0.090909
							if( bearPower > 0.087501 )
								ret := -1.000000 // sell
					if( Lower_Band > 11.5157 )
						if( bbp <= -0.352752 )
							ret := -0.071429
						if( bbp > -0.352752 )
							if( Lower_Band <= 12.6753 )
								ret := -1.000000 // sell
							if( Lower_Band > 12.6753 )
								if( bullPower <= -0.034514 )
									ret := -0.800000 // sell
								if( bullPower > -0.034514 )
									ret := -1.000000 // sell
		if( basis > 13.2253 )
			if( Lower_Band <= 14.9883 )
				if( Upper_Band <= 14.6536 )
					if( bearPower <= -0.110048 )
						if( basis <= 13.6232 )
							if( Lower_Band <= 13.2733 )
								if( basis <= 13.4074 )
									ret := 0.853659 // buy
								if( basis > 13.4074 )
									ret := 0.500000
							if( Lower_Band > 13.2733 )
								if( bbm <= 0.14634 )
									ret := 0.875000 // buy
								if( bbm > 0.14634 )
									ret := 1.000000 // buy
						if( basis > 13.6232 )
							if( Lower_Band <= 13.5595 )
								if( Upper_Band <= 14.1705 )
									ret := -0.900000 // sell
								if( Upper_Band > 14.1705 )
									ret := -1.000000 // sell
							if( Lower_Band > 13.5595 )
								if( Lower_Band <= 14.0088 )
									ret := 0.866667 // buy
								if( Lower_Band > 14.0088 )
									ret := -0.500000
					if( bearPower > -0.110048 )
						if( bearPower <= -0.004206 )
							if( Upper_Band <= 13.6737 )
								if( Upper_Band <= 13.6308 )
									ret := -0.976744 // sell
								if( Upper_Band > 13.6308 )
									ret := -0.846154 // sell
							if( Upper_Band > 13.6737 )
								if( basis <= 14.2605 )
									ret := 0.122302
								if( basis > 14.2605 )
									ret := -0.714286 // sell
						if( bearPower > -0.004206 )
							if( bbp <= 0.107682 )
								if( basis <= 13.4801 )
									ret := -1.000000 // sell
								if( basis > 13.4801 )
									ret := -0.888889 // sell
							if( bbp > 0.107682 )
								if( basis <= 13.4751 )
									ret := -0.882353 // sell
								if( basis > 13.4751 )
									ret := -0.735849 // sell
				if( Upper_Band > 14.6536 )
					if( BBPower_Color <= 0.5 )
						if( basis <= 14.8509 )
							if( bbm <= 0.119084 )
								if( basis <= 14.4887 )
									ret := 0.666667
								if( basis > 14.4887 )
									ret := 1.000000 // buy
							if( bbm > 0.119084 )
								if( bbp <= -0.329363 )
									ret := 0.937500 // buy
								if( bbp > -0.329363 )
									ret := 0.304348
						if( basis > 14.8509 )
							if( Upper_Band <= 15.1454 )
								if( bbm <= 0.110057 )
									ret := 0.230769
								if( bbm > 0.110057 )
									ret := -0.823529 // sell
							if( Upper_Band > 15.1454 )
								if( Lower_Band <= 14.0306 )
									ret := -0.846154 // sell
								if( Lower_Band > 14.0306 )
									ret := 0.693431
					if( BBPower_Color > 0.5 )
						if( Lower_Band <= 14.7689 )
							if( Upper_Band <= 15.0878 )
								if( bbp <= 0.102589 )
									ret := 0.512821
								if( bbp > 0.102589 )
									ret := -0.307692
							if( Upper_Band > 15.0878 )
								if( bbp <= 0.450761 )
									ret := -0.894737 // sell
								if( bbp > 0.450761 )
									ret := 0.000000
						if( Lower_Band > 14.7689 )
							if( basis <= 15.1873 )
								if( Upper_Band <= 15.3495 )
									ret := 0.183333
								if( Upper_Band > 15.3495 )
									ret := 0.866667 // buy
							if( basis > 15.1873 )
								if( bbm <= 0.100852 )
									ret := -0.187500
								if( bbm > 0.100852 )
									ret := -0.894737 // sell
			if( Lower_Band > 14.9883 )
				if( Lower_Band <= 15.5068 )
					if( Upper_Band <= 15.691 )
						if( Lower_Band <= 15.0189 )
							ret := -0.250000
						if( Lower_Band > 15.0189 )
							if( bbm <= 0.082104 )
								if( bearPower <= -0.06028 )
									ret := -0.217391
								if( bearPower > -0.06028 )
									ret := -0.733333 // sell
							if( bbm > 0.082104 )
								if( Upper_Band <= 15.4886 )
									ret := -1.000000 // sell
								if( Upper_Band > 15.4886 )
									ret := -0.836735 // sell
					if( Upper_Band > 15.691 )
						if( basis <= 15.7175 )
							ret := -1.000000 // sell
						if( basis > 15.7175 )
							if( bbp <= -0.982829 )
								ret := -1.000000 // sell
							if( bbp > -0.982829 )
								ret := -0.461538
				if( Lower_Band > 15.5068 )
					if( bearPower <= -0.109753 )
						if( Upper_Band <= 16.2764 )
							if( bbm <= 0.200963 )
								ret := -0.437500
							if( bbm > 0.200963 )
								ret := -1.000000 // sell
						if( Upper_Band > 16.2764 )
							if( Lower_Band <= 16.9325 )
								if( Upper_Band <= 17.1465 )
									ret := 0.287500
								if( Upper_Band > 17.1465 )
									ret := 0.785714 // buy
							if( Lower_Band > 16.9325 )
								ret := -0.900000 // sell
					if( bearPower > -0.109753 )
						if( Upper_Band <= 17.2288 )
							if( Lower_Band <= 15.754 )
								ret := 0.916667 // buy
							if( Lower_Band > 15.754 )
								if( bbp <= 0.106539 )
									ret := -0.412698
								if( bbp > 0.106539 )
									ret := 0.354839
						if( Upper_Band > 17.2288 )
							if( Lower_Band <= 16.7416 )
								if( bbp <= 0.231339 )
									ret := -0.285714
								if( bbp > 0.231339 )
									ret := -0.846154 // sell
							if( Lower_Band > 16.7416 )
								if( bullPower <= 0.036786 )
									ret := -0.764706 // sell
								if( bullPower > 0.036786 )
									ret := -0.982456 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_DOTUSDT_15Min_794cae89(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


