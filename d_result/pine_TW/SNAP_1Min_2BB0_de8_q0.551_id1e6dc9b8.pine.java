//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: SNAP_1Min_2BB0_1e6dc9b8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2BB0_1e6dc9b8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_1e6dc9b8(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( bearPower <= 0.007131 )
		if( bullPower <= -0.012751 )
			if( bbm <= 0.007461 )
				if( basis <= 10.7855 )
					if( bbp <= -0.036398 )
						if( basis <= 8.75249 )
							if( basis <= 8.64642 )
								if( Upper_Band <= 8.61471 )
									ret := 0.333333
								if( Upper_Band > 8.61471 )
									ret := 0.904762 // buy
							if( basis > 8.64642 )
								ret := -0.846154 // sell
						if( basis > 8.75249 )
							if( bearPower <= -0.026428 )
								if( bbp <= -0.056595 )
									ret := 0.654054
								if( bbp > -0.056595 )
									ret := 0.168539
							if( bearPower > -0.026428 )
								if( basis <= 9.4697 )
									ret := 0.802817 // buy
								if( basis > 9.4697 )
									ret := 0.571429
					if( bbp > -0.036398 )
						if( bearPower <= -0.019777 )
							if( bbm <= 0.005627 )
								ret := -0.636364
							if( bbm > 0.005627 )
								ret := 0.222222
						if( bearPower > -0.019777 )
							if( Upper_Band <= 10.4357 )
								if( basis <= 10.3691 )
									ret := 0.440000
								if( basis > 10.3691 )
									ret := -0.055556
							if( Upper_Band > 10.4357 )
								if( basis <= 10.5937 )
									ret := 0.789474 // buy
								if( basis > 10.5937 )
									ret := 0.375000
				if( basis > 10.7855 )
					if( bearPower <= -0.042139 )
						if( bbm <= 3.6e-05 )
							if( basis <= 16.3203 )
								if( bearPower <= -0.072204 )
									ret := 0.288462
								if( bearPower > -0.072204 )
									ret := 0.668790
							if( basis > 16.3203 )
								if( basis <= 16.3526 )
									ret := -0.750000 // sell
								if( basis > 16.3526 )
									ret := 0.412698
						if( bbm > 3.6e-05 )
							if( Upper_Band <= 16.2964 )
								if( Lower_Band <= 15.0886 )
									ret := 0.846154 // buy
								if( Lower_Band > 15.0886 )
									ret := 0.461538
							if( Upper_Band > 16.2964 )
								ret := 1.000000 // buy
					if( bearPower > -0.042139 )
						if( basis <= 16.7305 )
							if( Upper_Band <= 10.8269 )
								ret := -0.846154 // sell
							if( Upper_Band > 10.8269 )
								if( basis <= 15.7156 )
									ret := 0.284569
								if( basis > 15.7156 )
									ret := 0.083871
						if( basis > 16.7305 )
							if( bearPower <= -0.019898 )
								if( bbm <= 0.00014 )
									ret := 0.610169
								if( bbm > 0.00014 )
									ret := 0.970588 // buy
							if( bearPower > -0.019898 )
								if( bullPower <= -0.015031 )
									ret := -0.111111
								if( bullPower > -0.015031 )
									ret := 0.307692
			if( bbm > 0.007461 )
				if( bullPower <= -0.113071 )
					if( Upper_Band <= 13.6302 )
						if( basis <= 10.9431 )
							if( basis <= 9.32043 )
								ret := -0.181818
							if( basis > 9.32043 )
								ret := 0.941176 // buy
						if( basis > 10.9431 )
							if( Upper_Band <= 11.3633 )
								ret := -1.000000 // sell
							if( Upper_Band > 11.3633 )
								ret := -0.428571
					if( Upper_Band > 13.6302 )
						if( Lower_Band <= 16.2153 )
							if( Upper_Band <= 14.1255 )
								ret := 0.642857
							if( Upper_Band > 14.1255 )
								if( basis <= 16.1578 )
									ret := 0.989474 // buy
								if( basis > 16.1578 )
									ret := 0.769231 // buy
						if( Lower_Band > 16.2153 )
							ret := 0.500000
				if( bullPower > -0.113071 )
					if( basis <= 15.2344 )
						if( Upper_Band <= 14.9604 )
							if( basis <= 14.7808 )
								if( Upper_Band <= 14.7165 )
									ret := 0.092987
								if( Upper_Band > 14.7165 )
									ret := 0.413043
							if( basis > 14.7808 )
								if( bbm <= 0.031179 )
									ret := -0.250000
								if( bbm > 0.031179 )
									ret := -0.731707 // sell
						if( Upper_Band > 14.9604 )
							if( bbp <= -0.075331 )
								if( bbp <= -0.193679 )
									ret := -0.416667
								if( bbp > -0.193679 )
									ret := 0.580071
							if( bbp > -0.075331 )
								if( bbm <= 0.008937 )
									ret := -0.533333
								if( bbm > 0.008937 )
									ret := 0.030675
					if( basis > 15.2344 )
						if( basis <= 15.5159 )
							if( bbm <= 0.01965 )
								if( Lower_Band <= 15.3024 )
									ret := 0.179856
								if( Lower_Band > 15.3024 )
									ret := -0.244094
							if( bbm > 0.01965 )
								if( bearPower <= -0.059683 )
									ret := 0.061728
								if( bearPower > -0.059683 )
									ret := -0.507042
						if( basis > 15.5159 )
							if( bearPower <= -0.079367 )
								if( basis <= 15.7536 )
									ret := 0.454545
								if( basis > 15.7536 )
									ret := -0.208759
							if( bearPower > -0.079367 )
								if( basis <= 16.512 )
									ret := 0.071827
								if( basis > 16.512 )
									ret := 0.230769
		if( bullPower > -0.012751 )
			if( bbm <= 0.014993 )
				if( bbp <= -0.002274 )
					if( bbm <= 0.00466 )
						if( basis <= 15.1179 )
							if( bbp <= -0.009364 )
								if( Lower_Band <= 8.28327 )
									ret := 0.833333 // buy
								if( Lower_Band > 8.28327 )
									ret := 0.332656
							if( bbp > -0.009364 )
								if( bearPower <= -0.004765 )
									ret := 0.586207
								if( bearPower > -0.004765 )
									ret := 0.138298
						if( basis > 15.1179 )
							if( Upper_Band <= 16.5409 )
								if( Lower_Band <= 16.3438 )
									ret := 0.059420
								if( Lower_Band > 16.3438 )
									ret := -0.764706 // sell
							if( Upper_Band > 16.5409 )
								if( bbm <= 0.00052 )
									ret := 0.170588
								if( bbm > 0.00052 )
									ret := 0.744681 // buy
					if( bbm > 0.00466 )
						if( basis <= 9.22994 )
							if( basis <= 9.20562 )
								if( bullPower <= -0.011014 )
									ret := 0.625000
								if( bullPower > -0.011014 )
									ret := 0.162954
							if( basis > 9.20562 )
								if( bbm <= 0.010033 )
									ret := 0.355556
								if( bbm > 0.010033 )
									ret := 0.828571 // buy
						if( basis > 9.22994 )
							if( basis <= 10.0069 )
								if( bullPower <= 0.000487 )
									ret := -0.095964
								if( bullPower > 0.000487 )
									ret := 0.195804
							if( basis > 10.0069 )
								if( Lower_Band <= 9.99302 )
									ret := 0.761905 // buy
								if( Lower_Band > 9.99302 )
									ret := 0.098975
				if( bbp > -0.002274 )
					if( bbm <= 0.012167 )
						if( bearPower <= -0.005325 )
							if( basis <= 8.86989 )
								if( bullPower <= 0.004478 )
									ret := -0.526316
								if( bullPower > 0.004478 )
									ret := -0.933333 // sell
							if( basis > 8.86989 )
								if( bbp <= -0.000495 )
									ret := -0.125000
								if( bbp > -0.000495 )
									ret := -0.785714 // sell
						if( bearPower > -0.005325 )
							if( Upper_Band <= 9.07818 )
								if( basis <= 9.02007 )
									ret := -0.021963
								if( basis > 9.02007 )
									ret := -0.447368
							if( Upper_Band > 9.07818 )
								if( Lower_Band <= 9.22852 )
									ret := 0.317427
								if( Lower_Band > 9.22852 )
									ret := 0.043144
					if( bbm > 0.012167 )
						if( basis <= 9.1207 )
							if( basis <= 9.04444 )
								if( bbm <= 0.014122 )
									ret := 0.316832
								if( bbm > 0.014122 )
									ret := -0.177419
							if( basis > 9.04444 )
								if( basis <= 9.06161 )
									ret := -0.937500 // sell
								if( basis > 9.06161 )
									ret := -0.666667
						if( basis > 9.1207 )
							if( bbm <= 0.01495 )
								if( Upper_Band <= 16.5309 )
									ret := 0.237960
								if( Upper_Band > 16.5309 )
									ret := 0.690476
							if( bbm > 0.01495 )
								if( Lower_Band <= 10.1979 )
									ret := 0.777778 // buy
								if( Lower_Band > 10.1979 )
									ret := 1.000000 // buy
			if( bbm > 0.014993 )
				if( basis <= 17.0162 )
					if( bearPower <= -0.077978 )
						if( bearPower <= -0.186273 )
							if( basis <= 14.3056 )
								if( bearPower <= -0.250177 )
									ret := -0.150000
								if( bearPower > -0.250177 )
									ret := 0.833333 // buy
							if( basis > 14.3056 )
								ret := 1.000000 // buy
						if( bearPower > -0.186273 )
							if( basis <= 11.4818 )
								if( basis <= 11.4356 )
									ret := -0.290323
								if( basis > 11.4356 )
									ret := 0.826087 // buy
							if( basis > 11.4818 )
								if( basis <= 14.5394 )
									ret := -0.629032
								if( basis > 14.5394 )
									ret := -0.211009
					if( bearPower > -0.077978 )
						if( bullPower <= -0.002959 )
							if( Upper_Band <= 16.4192 )
								if( Lower_Band <= 8.48071 )
									ret := 0.382716
								if( Lower_Band > 8.48071 )
									ret := -0.042407
							if( Upper_Band > 16.4192 )
								if( basis <= 16.5262 )
									ret := 0.601852
								if( basis > 16.5262 )
									ret := 0.106383
						if( bullPower > -0.002959 )
							if( bbp <= -0.013752 )
								if( Upper_Band <= 16.7509 )
									ret := 0.127526
								if( Upper_Band > 16.7509 )
									ret := -0.143443
							if( bbp > -0.013752 )
								if( basis <= 16.9062 )
									ret := 0.027265
								if( basis > 16.9062 )
									ret := 0.744186 // buy
				if( basis > 17.0162 )
					if( Lower_Band <= 16.9629 )
						if( bbp <= 0.00177 )
							ret := -1.000000 // sell
						if( bbp > 0.00177 )
							ret := -0.764706 // sell
					if( Lower_Band > 16.9629 )
						if( bullPower <= 0.01795 )
							if( bbp <= 0.004887 )
								if( Upper_Band <= 17.1685 )
									ret := 0.023256
								if( Upper_Band > 17.1685 )
									ret := -0.391892
							if( bbp > 0.004887 )
								if( bullPower <= 0.014704 )
									ret := 0.555556
								if( bullPower > 0.014704 )
									ret := 0.600000
						if( bullPower > 0.01795 )
							if( Upper_Band <= 17.2131 )
								if( bearPower <= -0.00211 )
									ret := -0.972973 // sell
								if( bearPower > -0.00211 )
									ret := -0.714286 // sell
							if( Upper_Band > 17.2131 )
								if( Upper_Band <= 17.2935 )
									ret := 0.235294
								if( Upper_Band > 17.2935 )
									ret := -0.681818
	if( bearPower > 0.007131 )
		if( bbm <= 0.003151 )
			if( bullPower <= 0.018666 )
				if( Upper_Band <= 10.141 )
					if( Lower_Band <= 8.57871 )
						if( basis <= 8.30615 )
							if( Upper_Band <= 8.31928 )
								ret := -0.454545
							if( Upper_Band > 8.31928 )
								ret := -1.000000 // sell
						if( basis > 8.30615 )
							if( Lower_Band <= 8.54887 )
								if( Lower_Band <= 8.33138 )
									ret := 0.600000
								if( Lower_Band > 8.33138 )
									ret := -0.092593
							if( Lower_Band > 8.54887 )
								if( bullPower <= 0.011393 )
									ret := 0.500000
								if( bullPower > 0.011393 )
									ret := 0.950000 // buy
					if( Lower_Band > 8.57871 )
						if( bbp <= 0.015993 )
							if( bbp <= 0.015222 )
								if( Upper_Band <= 8.8598 )
									ret := 0.142857
								if( Upper_Band > 8.8598 )
									ret := -0.375000
							if( bbp > 0.015222 )
								if( basis <= 9.15838 )
									ret := 0.437500
								if( basis > 9.15838 )
									ret := 0.030303
						if( bbp > 0.015993 )
							if( basis <= 8.61593 )
								ret := -0.923077 // sell
							if( basis > 8.61593 )
								if( basis <= 10.0357 )
									ret := -0.281337
								if( basis > 10.0357 )
									ret := -0.764706 // sell
				if( Upper_Band > 10.141 )
					if( basis <= 10.3369 )
						if( Lower_Band <= 10.2572 )
							if( basis <= 10.1723 )
								ret := 0.583333
							if( basis > 10.1723 )
								ret := -0.272727
						if( Lower_Band > 10.2572 )
							if( bullPower <= 0.011243 )
								ret := 0.700000 // buy
							if( bullPower > 0.011243 )
								ret := 1.000000 // buy
					if( basis > 10.3369 )
						if( Lower_Band <= 15.8287 )
							if( basis <= 15.6014 )
								if( basis <= 15.1411 )
									ret := -0.009804
								if( basis > 15.1411 )
									ret := -0.423645
							if( basis > 15.6014 )
								if( Lower_Band <= 15.765 )
									ret := 0.548077
								if( Lower_Band > 15.765 )
									ret := 0.000000
						if( Lower_Band > 15.8287 )
							if( Upper_Band <= 16.8836 )
								if( bbm <= 0.000475 )
									ret := -0.226277
								if( bbm > 0.000475 )
									ret := -0.777778 // sell
							if( Upper_Band > 16.8836 )
								if( basis <= 17.0772 )
									ret := 0.777778 // buy
								if( basis > 17.0772 )
									ret := 0.214286
			if( bullPower > 0.018666 )
				if( bearPower <= 0.080983 )
					if( basis <= 15.0505 )
						if( basis <= 10.1881 )
							if( bearPower <= 0.048745 )
								if( basis <= 10.1251 )
									ret := -0.368039
								if( basis > 10.1251 )
									ret := -1.000000 // sell
							if( bearPower > 0.048745 )
								if( basis <= 9.20989 )
									ret := -0.882353 // sell
								if( basis > 9.20989 )
									ret := -1.000000 // sell
						if( basis > 10.1881 )
							if( Lower_Band <= 10.257 )
								ret := 0.473684
							if( Lower_Band > 10.257 )
								if( bbm <= 0.002511 )
									ret := -0.138514
								if( bbm > 0.002511 )
									ret := -0.777778 // sell
					if( basis > 15.0505 )
						if( basis <= 15.114 )
							if( Upper_Band <= 15.1528 )
								ret := -0.416667
							if( Upper_Band > 15.1528 )
								if( basis <= 15.0952 )
									ret := -0.750000 // sell
								if( basis > 15.0952 )
									ret := -1.000000 // sell
						if( basis > 15.114 )
							if( Lower_Band <= 15.0086 )
								ret := 0.857143 // buy
							if( Lower_Band > 15.0086 )
								if( bullPower <= 0.026172 )
									ret := -0.495902
								if( bullPower > 0.026172 )
									ret := -0.345946
				if( bearPower > 0.080983 )
					if( Lower_Band <= 15.0053 )
						if( basis <= 14.6022 )
							if( Upper_Band <= 11.3644 )
								ret := -0.714286 // sell
							if( Upper_Band > 11.3644 )
								ret := -1.000000 // sell
						if( basis > 14.6022 )
							ret := -0.166667
					if( Lower_Band > 15.0053 )
						ret := -0.960000 // sell
		if( bbm > 0.003151 )
			if( bullPower <= 0.095746 )
				if( bbm <= 0.041837 )
					if( Upper_Band <= 15.0312 )
						if( basis <= 13.6182 )
							if( basis <= 8.84326 )
								if( bbm <= 0.008267 )
									ret := -0.410959
								if( bbm > 0.008267 )
									ret := 0.213178
							if( basis > 8.84326 )
								if( Lower_Band <= 8.86788 )
									ret := -0.579710
								if( Lower_Band > 8.86788 )
									ret := -0.042005
						if( basis > 13.6182 )
							if( bearPower <= 0.013146 )
								if( Lower_Band <= 14.568 )
									ret := 0.041885
								if( Lower_Band > 14.568 )
									ret := -0.394737
							if( bearPower > 0.013146 )
								if( Lower_Band <= 13.5764 )
									ret := -1.000000 // sell
								if( Lower_Band > 13.5764 )
									ret := -0.391097
					if( Upper_Band > 15.0312 )
						if( Upper_Band <= 15.9359 )
							if( Upper_Band <= 15.8354 )
								if( Upper_Band <= 15.7245 )
									ret := 0.101582
								if( Upper_Band > 15.7245 )
									ret := -0.136752
							if( Upper_Band > 15.8354 )
								if( Lower_Band <= 15.7642 )
									ret := 0.605405
								if( Lower_Band > 15.7642 )
									ret := 0.065327
						if( Upper_Band > 15.9359 )
							if( Lower_Band <= 15.8392 )
								if( Upper_Band <= 16.0248 )
									ret := -0.572193
								if( Upper_Band > 16.0248 )
									ret := -0.062500
							if( Lower_Band > 15.8392 )
								if( Lower_Band <= 16.4231 )
									ret := 0.067559
								if( Lower_Band > 16.4231 )
									ret := -0.108553
				if( bbm > 0.041837 )
					if( basis <= 8.46487 )
						ret := 1.000000 // buy
					if( basis > 8.46487 )
						if( Lower_Band <= 16.6628 )
							if( basis <= 13.9705 )
								if( Lower_Band <= 9.40108 )
									ret := -0.220588
								if( Lower_Band > 9.40108 )
									ret := 0.335593
							if( basis > 13.9705 )
								if( bullPower <= 0.094046 )
									ret := -0.074447
								if( bullPower > 0.094046 )
									ret := 0.809524 // buy
						if( Lower_Band > 16.6628 )
							if( bearPower <= 0.014943 )
								ret := 0.931034 // buy
							if( bearPower > 0.014943 )
								if( basis <= 16.8637 )
									ret := 0.454545
								if( basis > 16.8637 )
									ret := -0.555556
			if( bullPower > 0.095746 )
				if( Upper_Band <= 10.756 )
					if( bearPower <= 0.105177 )
						if( bullPower <= 0.124965 )
							if( bearPower <= 0.038509 )
								ret := 0.272727
							if( bearPower > 0.038509 )
								if( basis <= 9.53978 )
									ret := -0.954545 // sell
								if( basis > 9.53978 )
									ret := -0.100000
						if( bullPower > 0.124965 )
							if( bearPower <= 0.082607 )
								if( basis <= 9.54124 )
									ret := -0.909091 // sell
								if( basis > 9.54124 )
									ret := -1.000000 // sell
							if( bearPower > 0.082607 )
								ret := -0.555556
					if( bearPower > 0.105177 )
						ret := -0.111111
				if( Upper_Band > 10.756 )
					if( bearPower <= 0.036255 )
						if( bbm <= 0.093807 )
							if( bearPower <= 0.03266 )
								if( Upper_Band <= 15.4078 )
									ret := -0.407407
								if( Upper_Band > 15.4078 )
									ret := -0.030303
							if( bearPower > 0.03266 )
								ret := -0.875000 // sell
						if( bbm > 0.093807 )
							if( Upper_Band <= 14.4649 )
								ret := -0.117647
							if( Upper_Band > 14.4649 )
								if( bbm <= 0.133371 )
									ret := -1.000000 // sell
								if( bbm > 0.133371 )
									ret := -0.846154 // sell
					if( bearPower > 0.036255 )
						if( bbm <= 0.027058 )
							if( basis <= 14.9151 )
								ret := -0.444444
							if( basis > 14.9151 )
								if( basis <= 15.9556 )
									ret := -0.947368 // sell
								if( basis > 15.9556 )
									ret := -0.642857
						if( bbm > 0.027058 )
							if( bbm <= 0.03161 )
								if( bearPower <= 0.077064 )
									ret := 0.125000
								if( bearPower > 0.077064 )
									ret := 0.900000 // buy
							if( bbm > 0.03161 )
								if( basis <= 15.1551 )
									ret := 0.082888
								if( basis > 15.1551 )
									ret := -0.244373
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_1e6dc9b8(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)

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


