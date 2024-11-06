//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: TWLO_15Min_2BB0_d81083a1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2BB0_d81083a1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_d81083a1(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= 0.028748 )
		if( Lower_Band <= 364.215 )
			if( bearPower <= -3.58943 )
				if( bbm <= 5.62843 )
					if( Lower_Band <= 53.963 )
						if( bullPower <= -2.47447 )
							if( bbp <= -9.26953 )
								ret := -0.750000 // sell
							if( bbp > -9.26953 )
								if( bbm <= 1.31674 )
									ret := -1.000000 // sell
								if( bbm > 1.31674 )
									ret := -0.875000 // sell
						if( bullPower > -2.47447 )
							ret := -0.400000
					if( Lower_Band > 53.963 )
						if( Lower_Band <= 113.351 )
							if( bullPower <= -1.7985 )
								if( bbm <= 0.70495 )
									ret := -0.764706 // sell
								if( bbm > 0.70495 )
									ret := 0.580645
							if( bullPower > -1.7985 )
								if( basis <= 108.353 )
									ret := -0.872727 // sell
								if( basis > 108.353 )
									ret := 0.916667 // buy
						if( Lower_Band > 113.351 )
							if( Lower_Band <= 125.377 )
								if( Lower_Band <= 114.539 )
									ret := -0.142857
								if( Lower_Band > 114.539 )
									ret := -0.797101 // sell
							if( Lower_Band > 125.377 )
								if( bbm <= 1.24511 )
									ret := 0.300847
								if( bbm > 1.24511 )
									ret := -0.059330
				if( bbm > 5.62843 )
					if( bbm <= 8.82621 )
						if( bbp <= -34.8926 )
							ret := -0.800000 // sell
						if( bbp > -34.8926 )
							if( bearPower <= -7.27346 )
								if( Upper_Band <= 324.864 )
									ret := 0.661538
								if( Upper_Band > 324.864 )
									ret := 0.155172
							if( bearPower > -7.27346 )
								if( Upper_Band <= 297.219 )
									ret := -1.000000 // sell
								if( Upper_Band > 297.219 )
									ret := 0.352941
					if( bbm > 8.82621 )
						if( basis <= 293.545 )
							if( Lower_Band <= 227.852 )
								ret := 0.750000 // buy
							if( Lower_Band > 227.852 )
								ret := 1.000000 // buy
						if( basis > 293.545 )
							if( bbp <= -19.7208 )
								if( bearPower <= -17.6864 )
									ret := 0.750000 // buy
								if( bearPower > -17.6864 )
									ret := 1.000000 // buy
							if( bbp > -19.7208 )
								ret := -0.500000
			if( bearPower > -3.58943 )
				if( bbm <= 0.089588 )
					if( bbp <= -0.42259 )
						if( Upper_Band <= 64.4819 )
							if( Lower_Band <= 42.6953 )
								if( Upper_Band <= 24.9618 )
									ret := -0.272727
								if( Upper_Band > 24.9618 )
									ret := 0.688889
							if( Lower_Band > 42.6953 )
								if( Lower_Band <= 55.7892 )
									ret := -0.047368
								if( Lower_Band > 55.7892 )
									ret := 0.510166
						if( Upper_Band > 64.4819 )
							if( bearPower <= -0.42161 )
								if( bbp <= -1.59077 )
									ret := 0.142322
								if( bbp > -1.59077 )
									ret := 0.299204
							if( bearPower > -0.42161 )
								if( basis <= 63.4447 )
									ret := -1.000000 // sell
								if( basis > 63.4447 )
									ret := 0.086729
					if( bbp > -0.42259 )
						if( Lower_Band <= 30.7002 )
							if( bearPower <= -0.028057 )
								if( Upper_Band <= 26.8861 )
									ret := 0.154297
								if( Upper_Band > 26.8861 )
									ret := 0.374415
							if( bearPower > -0.028057 )
								if( basis <= 28.3078 )
									ret := 0.278571
								if( basis > 28.3078 )
									ret := -0.213793
						if( Lower_Band > 30.7002 )
							if( basis <= 31.1542 )
								if( Upper_Band <= 31.2085 )
									ret := -1.000000 // sell
								if( Upper_Band > 31.2085 )
									ret := -0.735294 // sell
							if( basis > 31.1542 )
								if( Lower_Band <= 47.9243 )
									ret := -0.009023
								if( Lower_Band > 47.9243 )
									ret := 0.121718
				if( bbm > 0.089588 )
					if( Upper_Band <= 25.1113 )
						if( bbp <= -0.840819 )
							if( Upper_Band <= 24.3993 )
								ret := -1.000000 // sell
							if( Upper_Band > 24.3993 )
								if( bearPower <= -1.02813 )
									ret := 1.000000 // buy
								if( bearPower > -1.02813 )
									ret := 0.250000
						if( bbp > -0.840819 )
							if( Lower_Band <= 23.4483 )
								if( Upper_Band <= 24.0677 )
									ret := 0.600000
								if( Upper_Band > 24.0677 )
									ret := 0.931034 // buy
							if( Lower_Band > 23.4483 )
								if( Upper_Band <= 24.4203 )
									ret := -0.121212
								if( Upper_Band > 24.4203 )
									ret := 0.437500
					if( Upper_Band > 25.1113 )
						if( Lower_Band <= 25.028 )
							if( basis <= 24.5528 )
								if( Upper_Band <= 25.1851 )
									ret := 1.000000 // buy
								if( Upper_Band > 25.1851 )
									ret := 0.250000
							if( basis > 24.5528 )
								if( bbm <= 0.180209 )
									ret := -0.247706
								if( bbm > 0.180209 )
									ret := -0.602564
						if( Lower_Band > 25.028 )
							if( basis <= 350.023 )
								if( Lower_Band <= 282.616 )
									ret := 0.093612
								if( Lower_Band > 282.616 )
									ret := -0.016277
							if( basis > 350.023 )
								if( basis <= 369.198 )
									ret := 0.354396
								if( basis > 369.198 )
									ret := -0.400000
		if( Lower_Band > 364.215 )
			if( Lower_Band <= 365.686 )
				if( bearPower <= -2.19054 )
					if( Lower_Band <= 365.504 )
						if( Upper_Band <= 372.541 )
							if( basis <= 368.51 )
								ret := 0.200000
							if( basis > 368.51 )
								ret := 1.000000 // buy
						if( Upper_Band > 372.541 )
							if( Upper_Band <= 383.852 )
								if( Upper_Band <= 377.358 )
									ret := 0.000000
								if( Upper_Band > 377.358 )
									ret := -0.500000
							if( Upper_Band > 383.852 )
								ret := 0.500000
					if( Lower_Band > 365.504 )
						ret := -0.857143 // sell
				if( bearPower > -2.19054 )
					if( basis <= 366.527 )
						ret := 0.285714
					if( basis > 366.527 )
						if( Lower_Band <= 365.538 )
							if( bearPower <= -1.18233 )
								if( Upper_Band <= 369.461 )
									ret := -0.909091 // sell
								if( Upper_Band > 369.461 )
									ret := -0.166667
							if( bearPower > -1.18233 )
								if( bullPower <= -0.098983 )
									ret := -0.939394 // sell
								if( bullPower > -0.098983 )
									ret := -0.571429
						if( Lower_Band > 365.538 )
							ret := 0.000000
			if( Lower_Band > 365.686 )
				if( bbm <= 4.87664 )
					if( bbm <= 0.362963 )
						if( Upper_Band <= 396.137 )
							if( Lower_Band <= 384.548 )
								if( basis <= 375.447 )
									ret := 0.431818
								if( basis > 375.447 )
									ret := -0.130952
							if( Lower_Band > 384.548 )
								if( Lower_Band <= 391.361 )
									ret := 0.652174
								if( Lower_Band > 391.361 )
									ret := 0.000000
						if( Upper_Band > 396.137 )
							if( basis <= 409.293 )
								if( basis <= 406.908 )
									ret := -0.354839
								if( basis > 406.908 )
									ret := 0.571429
							if( basis > 409.293 )
								if( bearPower <= -1.55429 )
									ret := 0.000000
								if( bearPower > -1.55429 )
									ret := -0.848485 // sell
					if( bbm > 0.362963 )
						if( Upper_Band <= 426.911 )
							if( Lower_Band <= 397.057 )
								if( bbm <= 1.71517 )
									ret := -0.030151
								if( bbm > 1.71517 )
									ret := -0.295181
							if( Lower_Band > 397.057 )
								if( basis <= 414.77 )
									ret := -0.507463
								if( basis > 414.77 )
									ret := -0.962963 // sell
						if( Upper_Band > 426.911 )
							if( Lower_Band <= 416.184 )
								if( Lower_Band <= 409.447 )
									ret := 0.000000
								if( Lower_Band > 409.447 )
									ret := 0.880952 // buy
							if( Lower_Band > 416.184 )
								if( basis <= 433.598 )
									ret := 0.333333
								if( basis > 433.598 )
									ret := -0.511111
				if( bbm > 4.87664 )
					if( bbm <= 4.98602 )
						ret := 1.000000 // buy
					if( bbm > 4.98602 )
						if( Lower_Band <= 393.633 )
							if( bullPower <= -6.12064 )
								ret := -0.571429
							if( bullPower > -6.12064 )
								if( bbm <= 7.94 )
									ret := 0.800000 // buy
								if( bbm > 7.94 )
									ret := 0.300000
						if( Lower_Band > 393.633 )
							if( basis <= 426.045 )
								if( Upper_Band <= 416.615 )
									ret := -1.000000 // sell
								if( Upper_Band > 416.615 )
									ret := -0.181818
							if( basis > 426.045 )
								if( bbp <= -10.736 )
									ret := 0.285714
								if( bbp > -10.736 )
									ret := 0.875000 // buy
	if( bullPower > 0.028748 )
		if( bbm <= 0.176179 )
			if( Lower_Band <= 223.385 )
				if( Upper_Band <= 212.536 )
					if( bbp <= 0.505065 )
						if( bearPower <= 0.194112 )
							if( basis <= 23.1983 )
								if( bbp <= 0.074371 )
									ret := 0.285714
								if( bbp > 0.074371 )
									ret := 1.000000 // buy
							if( basis > 23.1983 )
								if( Upper_Band <= 23.7799 )
									ret := -0.551724
								if( Upper_Band > 23.7799 )
									ret := 0.003701
						if( bearPower > 0.194112 )
							if( Lower_Band <= 55.5253 )
								if( bbp <= 0.498655 )
									ret := 0.036232
								if( bbp > 0.498655 )
									ret := 0.666667
							if( Lower_Band > 55.5253 )
								if( Lower_Band <= 55.8959 )
									ret := -1.000000 // sell
								if( Lower_Band > 55.8959 )
									ret := -0.193103
					if( bbp > 0.505065 )
						if( Upper_Band <= 82.0755 )
							if( Lower_Band <= 72.8886 )
								if( Lower_Band <= 23.072 )
									ret := -0.904762 // sell
								if( Lower_Band > 23.072 )
									ret := -0.151979
							if( Lower_Band > 72.8886 )
								if( bearPower <= 0.219513 )
									ret := 0.300000
								if( bearPower > 0.219513 )
									ret := -0.569307
						if( Upper_Band > 82.0755 )
							if( Upper_Band <= 86.2467 )
								if( Lower_Band <= 80.4087 )
									ret := 0.725490 // buy
								if( Lower_Band > 80.4087 )
									ret := 0.303371
							if( Upper_Band > 86.2467 )
								if( Upper_Band <= 201.979 )
									ret := -0.106690
								if( Upper_Band > 201.979 )
									ret := 0.490909
				if( Upper_Band > 212.536 )
					if( bbp <= 4.39115 )
						if( bearPower <= 1.00995 )
							if( bearPower <= 0.665661 )
								if( bullPower <= 0.633746 )
									ret := -0.333333
								if( bullPower > 0.633746 )
									ret := 0.166667
							if( bearPower > 0.665661 )
								if( basis <= 213.607 )
									ret := 0.000000
								if( basis > 213.607 )
									ret := -0.941176 // sell
						if( bearPower > 1.00995 )
							if( bullPower <= 1.24277 )
								if( Lower_Band <= 217.511 )
									ret := 0.250000
								if( Lower_Band > 217.511 )
									ret := 1.000000 // buy
							if( bullPower > 1.24277 )
								if( Lower_Band <= 214.283 )
									ret := 0.000000
								if( Lower_Band > 214.283 )
									ret := -0.611111
					if( bbp > 4.39115 )
						if( basis <= 224.065 )
							if( bearPower <= 3.98771 )
								if( Upper_Band <= 226.374 )
									ret := -1.000000 // sell
								if( Upper_Band > 226.374 )
									ret := -0.750000 // sell
							if( bearPower > 3.98771 )
								ret := -0.750000 // sell
						if( basis > 224.065 )
							ret := -0.200000
			if( Lower_Band > 223.385 )
				if( Upper_Band <= 237.433 )
					if( bearPower <= 0.905379 )
						if( Lower_Band <= 232.045 )
							if( Lower_Band <= 223.927 )
								ret := 1.000000 // buy
							if( Lower_Band > 223.927 )
								ret := 0.714286 // buy
						if( Lower_Band > 232.045 )
							ret := 1.000000 // buy
					if( bearPower > 0.905379 )
						if( bearPower <= 1.46394 )
							ret := 0.166667
						if( bearPower > 1.46394 )
							ret := 1.000000 // buy
				if( Upper_Band > 237.433 )
					if( Upper_Band <= 396.581 )
						if( Lower_Band <= 373.758 )
							if( bullPower <= 0.989192 )
								if( basis <= 370.658 )
									ret := 0.171244
								if( basis > 370.658 )
									ret := -0.600000
							if( bullPower > 0.989192 )
								if( basis <= 368.974 )
									ret := -0.055227
								if( basis > 368.974 )
									ret := 0.564103
						if( Lower_Band > 373.758 )
							if( bullPower <= 0.895069 )
								if( Lower_Band <= 378.752 )
									ret := 1.000000 // buy
								if( Lower_Band > 378.752 )
									ret := 0.675000
							if( bullPower > 0.895069 )
								if( Upper_Band <= 389.033 )
									ret := 0.600000
								if( Upper_Band > 389.033 )
									ret := 0.056604
					if( Upper_Band > 396.581 )
						if( Lower_Band <= 431.001 )
							if( bbm <= 0.05356 )
								if( bbm <= 0.003184 )
									ret := -0.263158
								if( bbm > 0.003184 )
									ret := 0.400000
							if( bbm > 0.05356 )
								if( bbm <= 0.093484 )
									ret := -1.000000 // sell
								if( bbm > 0.093484 )
									ret := -0.625000
						if( Lower_Band > 431.001 )
							ret := 0.666667
		if( bbm > 0.176179 )
			if( Lower_Band <= 106.457 )
				if( Lower_Band <= 104.189 )
					if( Upper_Band <= 103.597 )
						if( basis <= 35.6178 )
							if( Lower_Band <= 31.3558 )
								if( basis <= 30.2918 )
									ret := -0.014823
								if( basis > 30.2918 )
									ret := 0.180055
							if( Lower_Band > 31.3558 )
								if( bbm <= 0.250124 )
									ret := -0.018519
								if( bbm > 0.250124 )
									ret := -0.379501
						if( basis > 35.6178 )
							if( bbp <= 3.0131 )
								if( basis <= 37.4809 )
									ret := 0.504854
								if( basis > 37.4809 )
									ret := 0.082355
							if( bbp > 3.0131 )
								if( basis <= 49.027 )
									ret := 0.518519
								if( basis > 49.027 )
									ret := -0.117299
					if( Upper_Band > 103.597 )
						if( bullPower <= 3.75209 )
							if( bbm <= 1.07511 )
								if( Lower_Band <= 96.0075 )
									ret := -0.818182 // sell
								if( Lower_Band > 96.0075 )
									ret := -0.005396
							if( bbm > 1.07511 )
								if( basis <= 107.482 )
									ret := -0.378676
								if( basis > 107.482 )
									ret := -0.925926 // sell
						if( bullPower > 3.75209 )
							if( Lower_Band <= 92.5816 )
								ret := -1.000000 // sell
							if( Lower_Band > 92.5816 )
								if( basis <= 101.213 )
									ret := 0.142857
								if( basis > 101.213 )
									ret := 0.836735 // buy
				if( Lower_Band > 104.189 )
					if( Upper_Band <= 106.39 )
						if( basis <= 105.421 )
							if( Lower_Band <= 104.732 )
								ret := -0.750000 // sell
							if( Lower_Band > 104.732 )
								ret := 0.000000
						if( basis > 105.421 )
							if( bearPower <= 0.065185 )
								ret := -1.000000 // sell
							if( bearPower > 0.065185 )
								ret := -0.750000 // sell
					if( Upper_Band > 106.39 )
						if( Lower_Band <= 104.761 )
							if( Upper_Band <= 107.104 )
								if( basis <= 105.54 )
									ret := 0.750000 // buy
								if( basis > 105.54 )
									ret := 1.000000 // buy
							if( Upper_Band > 107.104 )
								if( bearPower <= -0.366563 )
									ret := 0.050000
								if( bearPower > -0.366563 )
									ret := 0.510417
						if( Lower_Band > 104.761 )
							if( basis <= 108.171 )
								if( bearPower <= -1.41404 )
									ret := 0.900000 // buy
								if( bearPower > -1.41404 )
									ret := 0.024490
							if( basis > 108.171 )
								if( bearPower <= 0.389414 )
									ret := 0.678571
								if( bearPower > 0.389414 )
									ret := -0.220000
			if( Lower_Band > 106.457 )
				if( Lower_Band <= 410.876 )
					if( basis <= 396.847 )
						if( Upper_Band <= 392.153 )
							if( Lower_Band <= 374.357 )
								if( basis <= 114.199 )
									ret := -0.113740
								if( basis > 114.199 )
									ret := 0.003400
							if( Lower_Band > 374.357 )
								if( bullPower <= 5.7162 )
									ret := 0.407285
								if( bullPower > 5.7162 )
									ret := -0.750000 // sell
						if( Upper_Band > 392.153 )
							if( bbp <= 4.47691 )
								if( basis <= 383.014 )
									ret := -0.772727 // sell
								if( basis > 383.014 )
									ret := -0.142012
							if( bbp > 4.47691 )
								if( Upper_Band <= 400.041 )
									ret := -0.603774
								if( Upper_Band > 400.041 )
									ret := -0.217391
					if( basis > 396.847 )
						if( bearPower <= 2.94369 )
							if( basis <= 399.286 )
								if( bullPower <= 0.802566 )
									ret := 0.400000
								if( bullPower > 0.802566 )
									ret := 0.772727 // buy
							if( basis > 399.286 )
								if( Upper_Band <= 407.833 )
									ret := -0.393939
								if( Upper_Band > 407.833 )
									ret := 0.306977
						if( bearPower > 2.94369 )
							if( bbp <= 10.3815 )
								if( Upper_Band <= 414.519 )
									ret := -0.111111
								if( Upper_Band > 414.519 )
									ret := -1.000000 // sell
							if( bbp > 10.3815 )
								if( basis <= 414.75 )
									ret := -0.473684
								if( basis > 414.75 )
									ret := 0.312500
				if( Lower_Band > 410.876 )
					if( Upper_Band <= 439.612 )
						if( basis <= 426.889 )
							if( basis <= 419.871 )
								ret := -1.000000 // sell
							if( basis > 419.871 )
								if( bearPower <= -1.10239 )
									ret := -0.333333
								if( bearPower > -1.10239 )
									ret := -0.823529 // sell
						if( basis > 426.889 )
							if( bbp <= 3.70189 )
								if( Upper_Band <= 438.7 )
									ret := 0.510204
								if( Upper_Band > 438.7 )
									ret := -0.125000
							if( bbp > 3.70189 )
								if( Upper_Band <= 437.559 )
									ret := -0.900000 // sell
								if( Upper_Band > 437.559 )
									ret := -0.285714
					if( Upper_Band > 439.612 )
						if( bearPower <= -5.20275 )
							if( basis <= 450.329 )
								ret := 0.750000 // buy
							if( basis > 450.329 )
								ret := -0.500000
						if( bearPower > -5.20275 )
							if( Lower_Band <= 421.352 )
								ret := 0.000000
							if( Lower_Band > 421.352 )
								if( bearPower <= -0.773207 )
									ret := -0.750000 // sell
								if( bearPower > -0.773207 )
									ret := -0.972222 // sell
	
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
float op_operation = decision_tree_0_TWLO_15Min_d81083a1(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


