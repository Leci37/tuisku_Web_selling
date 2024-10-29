//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: DOTUSDT_30Min_2BB0_d8e00fe6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2BB0_d8e00fe6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_d8e00fe6(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbm <= 0.336572 )
		if( bullPower <= 0.123161 )
			if( Lower_Band <= 17.5025 )
				if( basis <= 17.2727 )
					if( bearPower <= -0.057258 )
						if( Lower_Band <= 15.1912 )
							if( bbm <= 0.167116 )
								if( basis <= 4.37275 )
									ret := 0.289246
								if( basis > 4.37275 )
									ret := 0.016862
							if( bbm > 0.167116 )
								if( Lower_Band <= 14.6065 )
									ret := 0.124446
								if( Lower_Band > 14.6065 )
									ret := 0.605072
						if( Lower_Band > 15.1912 )
							if( bearPower <= -0.269303 )
								if( bbm <= 0.15865 )
									ret := 0.166667
								if( bbm > 0.15865 )
									ret := -0.594972
							if( bearPower > -0.269303 )
								if( bbp <= -0.287687 )
									ret := -0.702703 // sell
								if( bbp > -0.287687 )
									ret := -0.041562
					if( bearPower > -0.057258 )
						if( basis <= 4.11072 )
							if( bbm <= 0.036171 )
								if( Lower_Band <= 3.8778 )
									ret := -0.065574
								if( Lower_Band > 3.8778 )
									ret := 0.075387
							if( bbm > 0.036171 )
								if( bearPower <= -0.049284 )
									ret := -0.288462
								if( bearPower > -0.049284 )
									ret := 0.393715
						if( basis > 4.11072 )
							if( bearPower <= -0.003576 )
								if( bbm <= 0.024621 )
									ret := -0.072373
								if( bbm > 0.024621 )
									ret := -0.025506
							if( bearPower > -0.003576 )
								if( Lower_Band <= 4.25977 )
									ret := -0.121329
								if( Lower_Band > 4.25977 )
									ret := 0.037597
				if( basis > 17.2727 )
					if( bbp <= 0.06893 )
						if( Lower_Band <= 16.9945 )
							if( bbp <= -0.19218 )
								if( Upper_Band <= 18.112 )
									ret := 0.777778 // buy
								if( Upper_Band > 18.112 )
									ret := 0.238636
							if( bbp > -0.19218 )
								if( bbm <= 0.220303 )
									ret := 0.766667 // buy
								if( bbm > 0.220303 )
									ret := 1.000000 // buy
						if( Lower_Band > 16.9945 )
							if( Upper_Band <= 18.034 )
								if( bearPower <= -0.260303 )
									ret := -0.769231 // sell
								if( bearPower > -0.260303 )
									ret := 0.044053
							if( Upper_Band > 18.034 )
								if( Upper_Band <= 18.2431 )
									ret := 0.737864 // buy
								if( Upper_Band > 18.2431 )
									ret := 0.055300
					if( bbp > 0.06893 )
						if( basis <= 17.5868 )
							ret := 0.470588
						if( basis > 17.5868 )
							ret := 0.869565 // buy
			if( Lower_Band > 17.5025 )
				if( basis <= 18.1542 )
					if( bbp <= -0.641548 )
						ret := 0.333333
					if( bbp > -0.641548 )
						if( Lower_Band <= 17.6208 )
							if( Upper_Band <= 18.1873 )
								if( Upper_Band <= 18.0332 )
									ret := -0.448980
								if( Upper_Band > 18.0332 )
									ret := -1.000000 // sell
							if( Upper_Band > 18.1873 )
								if( bullPower <= -0.086153 )
									ret := -0.880000 // sell
								if( bullPower > -0.086153 )
									ret := 0.756757 // buy
						if( Lower_Band > 17.6208 )
							if( bullPower <= 0.07907 )
								if( bbm <= 0.202241 )
									ret := -0.750000 // sell
								if( bbm > 0.202241 )
									ret := -0.512821
							if( bullPower > 0.07907 )
								if( bearPower <= -0.023114 )
									ret := 0.000000
								if( bearPower > -0.023114 )
									ret := -0.700000 // sell
				if( basis > 18.1542 )
					if( Upper_Band <= 19.3547 )
						if( Lower_Band <= 18.042 )
							if( bbm <= 0.202082 )
								if( Upper_Band <= 18.6682 )
									ret := -0.284404
								if( Upper_Band > 18.6682 )
									ret := 0.500000
							if( bbm > 0.202082 )
								if( bullPower <= -0.013182 )
									ret := -0.603448
								if( bullPower > -0.013182 )
									ret := -0.015873
						if( Lower_Band > 18.042 )
							if( bbm <= 0.180859 )
								if( bullPower <= 0.033022 )
									ret := 0.211538
								if( bullPower > 0.033022 )
									ret := -0.094650
							if( bbm > 0.180859 )
								if( basis <= 18.9125 )
									ret := 0.385475
								if( basis > 18.9125 )
									ret := 0.684211
					if( Upper_Band > 19.3547 )
						if( bullPower <= -0.233645 )
							if( Upper_Band <= 26.7054 )
								if( bbm <= 0.272227 )
									ret := -0.457944
								if( bbm > 0.272227 )
									ret := 0.019481
							if( Upper_Band > 26.7054 )
								if( Lower_Band <= 26.6152 )
									ret := 0.519481
								if( Lower_Band > 26.6152 )
									ret := 0.025974
						if( bullPower > -0.233645 )
							if( Lower_Band <= 18.9393 )
								if( bullPower <= -0.11267 )
									ret := -0.833333 // sell
								if( bullPower > -0.11267 )
									ret := -0.256684
							if( Lower_Band > 18.9393 )
								if( basis <= 19.3964 )
									ret := -0.720588 // sell
								if( basis > 19.3964 )
									ret := -0.114110
		if( bullPower > 0.123161 )
			if( Lower_Band <= 6.86916 )
				if( basis <= 6.75634 )
					if( basis <= 6.47703 )
						if( Upper_Band <= 5.4648 )
							if( Upper_Band <= 5.44488 )
								if( bbm <= 0.224459 )
									ret := -0.122951
								if( bbm > 0.224459 )
									ret := 0.655172
							if( Upper_Band > 5.44488 )
								if( bearPower <= 0.058374 )
									ret := -0.947368 // sell
								if( bearPower > 0.058374 )
									ret := -0.750000 // sell
						if( Upper_Band > 5.4648 )
							if( bearPower <= -0.05068 )
								if( bullPower <= 0.14686 )
									ret := -0.888889 // sell
								if( bullPower > 0.14686 )
									ret := -1.000000 // sell
							if( bearPower > -0.05068 )
								if( basis <= 6.35769 )
									ret := 0.076312
								if( basis > 6.35769 )
									ret := 0.429825
					if( basis > 6.47703 )
						if( Lower_Band <= 6.53718 )
							if( basis <= 6.65057 )
								if( bullPower <= 0.192239 )
									ret := -0.141176
								if( bullPower > 0.192239 )
									ret := -0.718750 // sell
							if( basis > 6.65057 )
								if( bbp <= 0.275797 )
									ret := 0.444444
								if( bbp > 0.275797 )
									ret := 0.809524 // buy
						if( Lower_Band > 6.53718 )
							if( bbm <= 0.089283 )
								ret := -1.000000 // sell
							if( bbm > 0.089283 )
								if( Lower_Band <= 6.59886 )
									ret := -0.714286 // sell
								if( Lower_Band > 6.59886 )
									ret := 0.142857
				if( basis > 6.75634 )
					if( bbm <= 0.173741 )
						if( bbm <= 0.07995 )
							if( basis <= 6.82335 )
								if( Upper_Band <= 6.99774 )
									ret := 0.968750 // buy
								if( Upper_Band > 6.99774 )
									ret := 0.714286 // buy
							if( basis > 6.82335 )
								if( bearPower <= 0.114914 )
									ret := 0.043478
								if( bearPower > 0.114914 )
									ret := 0.690476
						if( bbm > 0.07995 )
							if( bbm <= 0.166868 )
								if( bbp <= 0.41916 )
									ret := -0.012346
								if( bbp > 0.41916 )
									ret := 0.586667
							if( bbm > 0.166868 )
								ret := -0.750000 // sell
					if( bbm > 0.173741 )
						if( basis <= 7.17368 )
							if( bbp <= 0.579572 )
								if( bbm <= 0.25832 )
									ret := 0.828571 // buy
								if( bbm > 0.25832 )
									ret := 0.454545
							if( bbp > 0.579572 )
								ret := 1.000000 // buy
						if( basis > 7.17368 )
							if( basis <= 7.30604 )
								ret := 0.083333
							if( basis > 7.30604 )
								if( basis <= 7.48306 )
									ret := 1.000000 // buy
								if( basis > 7.48306 )
									ret := 0.214286
			if( Lower_Band > 6.86916 )
				if( basis <= 35.8482 )
					if( bullPower <= 0.765475 )
						if( basis <= 32.8867 )
							if( basis <= 32.4396 )
								if( basis <= 32.3443 )
									ret := -0.070818
								if( basis > 32.3443 )
									ret := 0.904762 // buy
							if( basis > 32.4396 )
								if( Lower_Band <= 32.1155 )
									ret := -0.418605
								if( Lower_Band > 32.1155 )
									ret := -0.880000 // sell
						if( basis > 32.8867 )
							if( basis <= 33.4483 )
								if( bearPower <= -0.047303 )
									ret := 0.300000
								if( bearPower > -0.047303 )
									ret := 0.724138 // buy
							if( basis > 33.4483 )
								if( basis <= 35.6406 )
									ret := -0.021368
								if( basis > 35.6406 )
									ret := 0.465116
					if( bullPower > 0.765475 )
						if( Lower_Band <= 16.6276 )
							ret := -0.142857
						if( Lower_Band > 16.6276 )
							if( Upper_Band <= 20.2243 )
								ret := -0.866667 // sell
							if( Upper_Band > 20.2243 )
								if( bbm <= 0.313996 )
									ret := -0.200000
								if( bbm > 0.313996 )
									ret := -0.709677 // sell
				if( basis > 35.8482 )
					if( Lower_Band <= 40.1531 )
						if( bearPower <= 0.231281 )
							if( bbp <= 0.437527 )
								if( Lower_Band <= 38.9624 )
									ret := -0.235023
								if( Lower_Band > 38.9624 )
									ret := -0.700000 // sell
							if( bbp > 0.437527 )
								if( bbp <= 0.526594 )
									ret := 0.400000
								if( bbp > 0.526594 )
									ret := -0.209677
						if( bearPower > 0.231281 )
							if( bearPower <= 0.310095 )
								if( bbp <= 0.797346 )
									ret := -0.600000
								if( bbp > 0.797346 )
									ret := -1.000000 // sell
							if( bearPower > 0.310095 )
								if( bullPower <= 0.685618 )
									ret := -0.277778
								if( bullPower > 0.685618 )
									ret := -0.826087 // sell
					if( Lower_Band > 40.1531 )
						if( bearPower <= -0.124734 )
							if( Lower_Band <= 42.9827 )
								ret := -0.333333
							if( Lower_Band > 42.9827 )
								ret := -0.846154 // sell
						if( bearPower > -0.124734 )
							if( bbm <= 0.322145 )
								if( Lower_Band <= 50.3633 )
									ret := 0.098425
								if( Lower_Band > 50.3633 )
									ret := -0.513514
							if( bbm > 0.322145 )
								if( Lower_Band <= 45.5622 )
									ret := -0.500000
								if( Lower_Band > 45.5622 )
									ret := -0.833333 // sell
	if( bbm > 0.336572 )
		if( bearPower <= -0.265198 )
			if( Lower_Band <= 29.2409 )
				if( Upper_Band <= 34.5794 )
					if( bearPower <= -0.452507 )
						if( Lower_Band <= 28.6355 )
							if( basis <= 30.0202 )
								if( bbp <= -0.781318 )
									ret := 0.144377
								if( bbp > -0.781318 )
									ret := 0.329923
							if( basis > 30.0202 )
								if( bbm <= 0.890264 )
									ret := 0.797101 // buy
								if( bbm > 0.890264 )
									ret := 1.000000 // buy
						if( Lower_Band > 28.6355 )
							if( basis <= 31.0414 )
								if( Upper_Band <= 30.685 )
									ret := 0.420000
								if( Upper_Band > 30.685 )
									ret := 0.876106 // buy
							if( basis > 31.0414 )
								ret := -0.150000
					if( bearPower > -0.452507 )
						if( basis <= 17.9375 )
							if( Lower_Band <= 15.1821 )
								if( bearPower <= -0.440249 )
									ret := -0.454545
								if( bearPower > -0.440249 )
									ret := 0.112613
							if( Lower_Band > 15.1821 )
								if( basis <= 16.2776 )
									ret := -0.880952 // sell
								if( basis > 16.2776 )
									ret := -0.301471
						if( basis > 17.9375 )
							if( bbm <= 0.579077 )
								if( bbm <= 0.446564 )
									ret := 0.229358
								if( bbm > 0.446564 )
									ret := 0.037594
							if( bbm > 0.579077 )
								if( bbp <= 0.125576 )
									ret := 0.437500
								if( bbp > 0.125576 )
									ret := 0.750000 // buy
				if( Upper_Band > 34.5794 )
					if( Lower_Band <= 21.0909 )
						ret := -1.000000 // sell
					if( Lower_Band > 21.0909 )
						if( bbm <= 1.2955 )
							if( basis <= 31.5048 )
								if( bbp <= -2.31763 )
									ret := -0.307692
								if( bbp > -2.31763 )
									ret := -0.125000
							if( basis > 31.5048 )
								if( bearPower <= -1.25205 )
									ret := -1.000000 // sell
								if( bearPower > -1.25205 )
									ret := -0.578947
						if( bbm > 1.2955 )
							if( basis <= 32.5372 )
								if( Lower_Band <= 27.7159 )
									ret := 0.350000
								if( Lower_Band > 27.7159 )
									ret := -0.333333
							if( basis > 32.5372 )
								if( bullPower <= -1.84421 )
									ret := 1.000000 // buy
								if( bullPower > -1.84421 )
									ret := 0.904762 // buy
			if( Lower_Band > 29.2409 )
				if( basis <= 41.8966 )
					if( bbm <= 3.93392 )
						if( bbp <= -1.33467 )
							if( Upper_Band <= 41.4239 )
								if( Lower_Band <= 38.2871 )
									ret := -0.213049
								if( Lower_Band > 38.2871 )
									ret := 0.833333 // buy
							if( Upper_Band > 41.4239 )
								if( Lower_Band <= 33.9858 )
									ret := -0.666667
								if( Lower_Band > 33.9858 )
									ret := 0.395939
						if( bbp > -1.33467 )
							if( bbm <= 1.10915 )
								if( Upper_Band <= 39.1689 )
									ret := 0.093449
								if( Upper_Band > 39.1689 )
									ret := 0.337090
							if( bbm > 1.10915 )
								if( basis <= 34.1506 )
									ret := 0.866667 // buy
								if( basis > 34.1506 )
									ret := -0.500000
					if( bbm > 3.93392 )
						if( bbp <= -5.90758 )
							ret := 0.823529 // buy
						if( bbp > -5.90758 )
							ret := 0.666667
				if( basis > 41.8966 )
					if( Upper_Band <= 52.2385 )
						if( bearPower <= -0.602036 )
							if( bbm <= 1.50581 )
								if( bearPower <= -1.19492 )
									ret := -0.458824
								if( bearPower > -1.19492 )
									ret := 0.122340
							if( bbm > 1.50581 )
								if( basis <= 43.6501 )
									ret := 0.888889 // buy
								if( basis > 43.6501 )
									ret := -0.075000
						if( bearPower > -0.602036 )
							if( bbp <= -0.152541 )
								if( bbp <= -0.452113 )
									ret := -0.240602
								if( bbp > -0.452113 )
									ret := -0.576132
							if( bbp > -0.152541 )
								if( bullPower <= 0.298242 )
									ret := 0.142857
								if( bullPower > 0.298242 )
									ret := -0.500000
					if( Upper_Band > 52.2385 )
						if( Upper_Band <= 52.2929 )
							ret := 0.950000 // buy
						if( Upper_Band > 52.2929 )
							if( bearPower <= -1.28008 )
								ret := -0.080000
							if( bearPower > -1.28008 )
								if( Lower_Band <= 49.5987 )
									ret := 0.931034 // buy
								if( Lower_Band > 49.5987 )
									ret := 0.245283
		if( bearPower > -0.265198 )
			if( bbm <= 0.982448 )
				if( Lower_Band <= 33.189 )
					if( bearPower <= -0.263846 )
						ret := -0.882353 // sell
					if( bearPower > -0.263846 )
						if( bbp <= -0.159339 )
							ret := 0.666667
						if( bbp > -0.159339 )
							if( basis <= 32.5499 )
								if( bbm <= 0.617566 )
									ret := 0.016554
								if( bbm > 0.617566 )
									ret := 0.197252
							if( basis > 32.5499 )
								if( Lower_Band <= 32.3541 )
									ret := 0.152455
								if( Lower_Band > 32.3541 )
									ret := 0.427692
				if( Lower_Band > 33.189 )
					if( basis <= 47.2316 )
						if( bearPower <= 0.637662 )
							if( bbm <= 0.63081 )
								if( BBPower_Color <= 0.5 )
									ret := -0.282700
								if( BBPower_Color > 0.5 )
									ret := -0.057310
							if( bbm > 0.63081 )
								if( basis <= 35.0907 )
									ret := -0.651163
								if( basis > 35.0907 )
									ret := -0.223656
						if( bearPower > 0.637662 )
							if( Lower_Band <= 41.231 )
								if( Upper_Band <= 40.9132 )
									ret := -0.421053
								if( Upper_Band > 40.9132 )
									ret := 0.146067
							if( Lower_Band > 41.231 )
								if( bullPower <= 1.1766 )
									ret := 0.000000
								if( bullPower > 1.1766 )
									ret := 0.686275
					if( basis > 47.2316 )
						if( bullPower <= 0.59243 )
							if( basis <= 53.4514 )
								if( Lower_Band <= 49.5537 )
									ret := -0.760000 // sell
								if( Lower_Band > 49.5537 )
									ret := -0.052632
							if( basis > 53.4514 )
								ret := -0.947368 // sell
						if( bullPower > 0.59243 )
							if( bbm <= 0.910783 )
								if( bearPower <= 0.626309 )
									ret := -0.757282 // sell
								if( bearPower > 0.626309 )
									ret := -1.000000 // sell
							if( bbm > 0.910783 )
								ret := 0.071429
			if( bbm > 0.982448 )
				if( Upper_Band <= 35.4483 )
					if( bbp <= 2.72873 )
						if( basis <= 32.9474 )
							if( basis <= 30.5644 )
								if( Upper_Band <= 28.913 )
									ret := -0.493506
								if( Upper_Band > 28.913 )
									ret := 0.362319
							if( basis > 30.5644 )
								if( Lower_Band <= 29.0002 )
									ret := -1.000000 // sell
								if( Lower_Band > 29.0002 )
									ret := -0.757576 // sell
						if( basis > 32.9474 )
							if( bbm <= 1.08122 )
								ret := 0.200000
							if( bbm > 1.08122 )
								if( Lower_Band <= 31.6105 )
									ret := 0.857143 // buy
								if( Lower_Band > 31.6105 )
									ret := 0.692308
					if( bbp > 2.72873 )
						ret := 0.578947
				if( Upper_Band > 35.4483 )
					if( Upper_Band <= 52.8848 )
						if( bbm <= 1.40683 )
							if( bearPower <= -0.148512 )
								if( bbm <= 1.19012 )
									ret := -1.000000 // sell
								if( bbm > 1.19012 )
									ret := -0.714286 // sell
							if( bearPower > -0.148512 )
								if( Upper_Band <= 42.7208 )
									ret := -0.455357
								if( Upper_Band > 42.7208 )
									ret := -0.050633
						if( bbm > 1.40683 )
							if( bbp <= 5.52477 )
								if( bbm <= 1.8551 )
									ret := -0.872727 // sell
								if( bbm > 1.8551 )
									ret := -0.615385
							if( bbp > 5.52477 )
								ret := 0.636364
					if( Upper_Band > 52.8848 )
						ret := 0.692308
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DOTUSDT_30Min_d8e00fe6(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


