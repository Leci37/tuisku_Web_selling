//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AVAXUSDT_30Min_2MT0_db4b2948 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2MT0_db4b2948", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_db4b2948(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema1 <= 86.8261 )
		if( Negative_Money_Flow <= 2.46255e+06 )
			if( ema1 <= 26.2538 )
				if( Raw_Money_Flow <= 21586.4 )
					if( MFI_High <= -36.6091 )
						if( MFI <= 38.7639 )
							if( ema1 <= 3.00284 )
								if( ema13 <= -0.009132 )
									ret := 0.354839
								if( ema13 > -0.009132 )
									ret := 1.000000 // buy
							if( ema1 > 3.00284 )
								if( Negative_Money_Flow_Sum <= 99289.8 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 99289.8 )
									ret := -0.100396
						if( MFI > 38.7639 )
							if( Negative_Money_Flow <= 18990.8 )
								if( MFI <= 40.599 )
									ret := -0.761194 // sell
								if( MFI > 40.599 )
									ret := -0.240964
							if( Negative_Money_Flow > 18990.8 )
								ret := 0.285714
					if( MFI_High > -36.6091 )
						if( Money_Flow_Ratio <= 1.07907 )
							if( Positive_Money_Flow <= 293.345 )
								if( ema1 <= 3.39753 )
									ret := -0.508772
								if( ema1 > 3.39753 )
									ret := 0.071429
							if( Positive_Money_Flow > 293.345 )
								if( Positive_Money_Flow_Sum <= 196100 )
									ret := 0.130435
								if( Positive_Money_Flow_Sum > 196100 )
									ret := 0.687500
						if( Money_Flow_Ratio > 1.07907 )
							if( Money_Flow_Ratio <= 1.96138 )
								if( Negative_Money_Flow_Sum <= 386342 )
									ret := -0.277405
								if( Negative_Money_Flow_Sum > 386342 )
									ret := 0.529412
							if( Money_Flow_Ratio > 1.96138 )
								if( Positive_Money_Flow <= 12485 )
									ret := 0.271967
								if( Positive_Money_Flow > 12485 )
									ret := -0.302521
				if( Raw_Money_Flow > 21586.4 )
					if( ema12 <= -0.134103 )
						if( Positive_Money_Flow_Sum <= 1.22999e+07 )
							if( Negative_Money_Flow <= 1.90374e+06 )
								if( MFI_High <= -67.8164 )
									ret := -0.269231
								if( MFI_High > -67.8164 )
									ret := 0.206799
							if( Negative_Money_Flow > 1.90374e+06 )
								if( MFI_Low <= 2.65647 )
									ret := -0.485075
								if( MFI_Low > 2.65647 )
									ret := 0.021583
						if( Positive_Money_Flow_Sum > 1.22999e+07 )
							if( Raw_Money_Flow <= 1.86678e+06 )
								if( ema12 <= -0.191945 )
									ret := -0.211538
								if( ema12 > -0.191945 )
									ret := -0.638554
							if( Raw_Money_Flow > 1.86678e+06 )
								if( MFI_High <= -27.7681 )
									ret := -0.084677
								if( MFI_High > -27.7681 )
									ret := 0.727273 // buy
					if( ema12 > -0.134103 )
						if( MFI_Low <= 62.8792 )
							if( Typical_Price <= 17.151 )
								if( tema <= 15.6358 )
									ret := 0.009328
								if( tema > 15.6358 )
									ret := 0.089978
							if( Typical_Price > 17.151 )
								if( tema <= 19.3608 )
									ret := -0.070709
								if( tema > 19.3608 )
									ret := 0.011752
						if( MFI_Low > 62.8792 )
							if( Negative_Money_Flow_Sum <= 1.02178e+06 )
								if( ema12 <= 0.113865 )
									ret := 0.049608
								if( ema12 > 0.113865 )
									ret := 0.460317
							if( Negative_Money_Flow_Sum > 1.02178e+06 )
								if( Negative_Money_Flow_Sum <= 4.25078e+06 )
									ret := -0.055782
								if( Negative_Money_Flow_Sum > 4.25078e+06 )
									ret := 0.367965
			if( ema1 > 26.2538 )
				if( MFI <= 56.8264 )
					if( ema3 <= 26.9624 )
						if( Money_Flow_Ratio <= 1.23782 )
							if( ema12 <= 0.009888 )
								if( ema13 <= 0.027895 )
									ret := -0.103659
								if( ema13 > 0.027895 )
									ret := 0.325000
							if( ema12 > 0.009888 )
								if( Raw_Money_Flow <= 1.79391e+06 )
									ret := -0.411765
								if( Raw_Money_Flow > 1.79391e+06 )
									ret := 0.173913
						if( Money_Flow_Ratio > 1.23782 )
							if( Negative_Money_Flow <= 608268 )
								if( Raw_Money_Flow <= 846240 )
									ret := 0.000000
								if( Raw_Money_Flow > 846240 )
									ret := -0.727273 // sell
							if( Negative_Money_Flow > 608268 )
								ret := -0.933333 // sell
					if( ema3 > 26.9624 )
						if( Negative_Money_Flow_Sum <= 4.61204e+07 )
							if( MFI_Low <= 20.9918 )
								if( Typical_Price <= 73.4052 )
									ret := 0.031070
								if( Typical_Price > 73.4052 )
									ret := -0.154639
							if( MFI_Low > 20.9918 )
								if( ema2 <= 65.225 )
									ret := -0.093287
								if( ema2 > 65.225 )
									ret := 0.051364
						if( Negative_Money_Flow_Sum > 4.61204e+07 )
							if( MFI <= 46.297 )
								if( ema12 <= -1.11201 )
									ret := 0.040881
								if( ema12 > -1.11201 )
									ret := -0.318761
							if( MFI > 46.297 )
								if( MFI_Low <= 28.3003 )
									ret := 0.550898
								if( MFI_Low > 28.3003 )
									ret := -0.134851
				if( MFI > 56.8264 )
					if( MFI_Low <= 63.6912 )
						if( Positive_Money_Flow_Sum <= 3.37277e+07 )
							if( ema13 <= -0.628635 )
								if( ema1 <= 33.8086 )
									ret := 1.000000 // buy
								if( ema1 > 33.8086 )
									ret := 0.736842 // buy
							if( ema13 > -0.628635 )
								if( ema3 <= 42.358 )
									ret := 0.032736
								if( ema3 > 42.358 )
									ret := 0.159605
						if( Positive_Money_Flow_Sum > 3.37277e+07 )
							if( Positive_Money_Flow_Sum <= 1.30212e+08 )
								if( ema13 <= 1.68056 )
									ret := -0.049918
								if( ema13 > 1.68056 )
									ret := 0.207819
							if( Positive_Money_Flow_Sum > 1.30212e+08 )
								if( ema13 <= 3.35692 )
									ret := -0.185751
								if( ema13 > 3.35692 )
									ret := -1.000000 // sell
					if( MFI_Low > 63.6912 )
						if( Positive_Money_Flow_Sum <= 1.76124e+07 )
							if( ema13 <= 0.327049 )
								if( Negative_Money_Flow <= 485836 )
									ret := -0.368421
								if( Negative_Money_Flow > 485836 )
									ret := -0.736842 // sell
							if( ema13 > 0.327049 )
								if( Raw_Money_Flow <= 576558 )
									ret := 0.166667
								if( Raw_Money_Flow > 576558 )
									ret := 0.519481
						if( Positive_Money_Flow_Sum > 1.76124e+07 )
							if( ema1 <= 75.5336 )
								if( MFI_High <= 15.3145 )
									ret := -0.331667
								if( MFI_High > 15.3145 )
									ret := 0.636364
							if( ema1 > 75.5336 )
								if( MFI_High <= 5.44817 )
									ret := 0.405405
								if( MFI_High > 5.44817 )
									ret := -0.152542
		if( Negative_Money_Flow > 2.46255e+06 )
			if( MFI_Low <= 2.40398 )
				if( Negative_Money_Flow <= 5.88675e+06 )
					if( tema <= 38.0855 )
						if( Negative_Money_Flow <= 5.14251e+06 )
							if( MFI_Low <= 0.928146 )
								if( tema <= 15.0457 )
									ret := 0.538462
								if( tema > 15.0457 )
									ret := -0.007614
							if( MFI_Low > 0.928146 )
								if( Raw_Money_Flow <= 3.35791e+06 )
									ret := 0.816327 // buy
								if( Raw_Money_Flow > 3.35791e+06 )
									ret := -0.062500
						if( Negative_Money_Flow > 5.14251e+06 )
							if( MFI_High <= -62.5532 )
								if( ema12 <= -0.463218 )
									ret := 0.300000
								if( ema12 > -0.463218 )
									ret := -0.500000
							if( MFI_High > -62.5532 )
								if( ema12 <= -0.373244 )
									ret := -0.727273 // sell
								if( ema12 > -0.373244 )
									ret := -1.000000 // sell
					if( tema > 38.0855 )
						if( Negative_Money_Flow_Sum <= 9.65917e+07 )
							if( Negative_Money_Flow_Sum <= 4.38147e+07 )
								if( ema3 <= 55.0256 )
									ret := 0.590164
								if( ema3 > 55.0256 )
									ret := 0.120968
							if( Negative_Money_Flow_Sum > 4.38147e+07 )
								if( ema1 <= 82.9796 )
									ret := 0.724299 // buy
								if( ema1 > 82.9796 )
									ret := -0.107143
						if( Negative_Money_Flow_Sum > 9.65917e+07 )
							if( Negative_Money_Flow <= 4.04417e+06 )
								ret := -0.769231 // sell
							if( Negative_Money_Flow > 4.04417e+06 )
								ret := 0.142857
				if( Negative_Money_Flow > 5.88675e+06 )
					if( Typical_Price <= 57.6094 )
						if( ema13 <= -0.77937 )
							if( Money_Flow_Ratio <= 0.018951 )
								ret := 0.076923
							if( Money_Flow_Ratio > 0.018951 )
								if( Negative_Money_Flow_Sum <= 2.02248e+08 )
									ret := 0.798780 // buy
								if( Negative_Money_Flow_Sum > 2.02248e+08 )
									ret := -0.071429
						if( ema13 > -0.77937 )
							if( ema13 <= -0.355168 )
								if( MFI <= 8.45202 )
									ret := -0.444444
								if( MFI > 8.45202 )
									ret := 0.226415
							if( ema13 > -0.355168 )
								if( Negative_Money_Flow_Sum <= 1.48789e+07 )
									ret := 0.956522 // buy
								if( Negative_Money_Flow_Sum > 1.48789e+07 )
									ret := 0.680000
					if( Typical_Price > 57.6094 )
						if( MFI_Low <= -0.77757 )
							if( Negative_Money_Flow_Sum <= 7.36283e+07 )
								if( ema2 <= 82.3055 )
									ret := -0.530612
								if( ema2 > 82.3055 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 7.36283e+07 )
								if( Typical_Price <= 62.5147 )
									ret := -0.312500
								if( Typical_Price > 62.5147 )
									ret := 0.470588
						if( MFI_Low > -0.77757 )
							if( Positive_Money_Flow_Sum <= 1.51545e+07 )
								ret := 0.200000
							if( Positive_Money_Flow_Sum > 1.51545e+07 )
								if( Negative_Money_Flow <= 1.11099e+07 )
									ret := 0.947368 // buy
								if( Negative_Money_Flow > 1.11099e+07 )
									ret := 0.571429
			if( MFI_Low > 2.40398 )
				if( MFI <= 25.1806 )
					if( Negative_Money_Flow <= 1.46441e+07 )
						if( MFI <= 22.9391 )
							if( ema13 <= -0.316974 )
								if( ema3 <= 71.3051 )
									ret := 0.074074
								if( ema3 > 71.3051 )
									ret := 0.750000 // buy
							if( ema13 > -0.316974 )
								ret := -0.600000
						if( MFI > 22.9391 )
							if( ema2 <= 53.0893 )
								if( ema3 <= 31.0196 )
									ret := -0.478992
								if( ema3 > 31.0196 )
									ret := 0.000000
							if( ema2 > 53.0893 )
								if( Positive_Money_Flow_Sum <= 9.20147e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 9.20147e+06 )
									ret := -0.586466
					if( Negative_Money_Flow > 1.46441e+07 )
						if( Raw_Money_Flow <= 2.16444e+07 )
							ret := 0.636364
						if( Raw_Money_Flow > 2.16444e+07 )
							ret := 0.909091 // buy
				if( MFI > 25.1806 )
					if( MFI_High <= -46.3649 )
						if( Typical_Price <= 51.5717 )
							if( Raw_Money_Flow <= 5.8011e+06 )
								if( Negative_Money_Flow <= 2.65415e+06 )
									ret := 0.040000
								if( Negative_Money_Flow > 2.65415e+06 )
									ret := 0.385403
							if( Raw_Money_Flow > 5.8011e+06 )
								if( ema12 <= -0.781369 )
									ret := 0.722222 // buy
								if( ema12 > -0.781369 )
									ret := -0.067010
						if( Typical_Price > 51.5717 )
							if( ema3 <= 72.9664 )
								if( Negative_Money_Flow_Sum <= 4.05206e+07 )
									ret := 0.313725
								if( Negative_Money_Flow_Sum > 4.05206e+07 )
									ret := -0.084175
							if( ema3 > 72.9664 )
								if( MFI_High <= -47.9138 )
									ret := 0.297297
								if( MFI_High > -47.9138 )
									ret := -0.133333
					if( MFI_High > -46.3649 )
						if( ema12 <= -0.830704 )
							if( Negative_Money_Flow_Sum <= 5.45541e+07 )
								if( MFI_Low <= 18.9063 )
									ret := 0.846154 // buy
								if( MFI_Low > 18.9063 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 5.45541e+07 )
								if( Raw_Money_Flow <= 5.32373e+06 )
									ret := -0.558140
								if( Raw_Money_Flow > 5.32373e+06 )
									ret := 0.420765
						if( ema12 > -0.830704 )
							if( Positive_Money_Flow_Sum <= 1.19652e+07 )
								if( MFI_Low <= 18.9141 )
									ret := -0.098522
								if( MFI_Low > 18.9141 )
									ret := 0.369792
							if( Positive_Money_Flow_Sum > 1.19652e+07 )
								if( ema12 <= 1.0184 )
									ret := -0.027106
								if( ema12 > 1.0184 )
									ret := 0.217742
	if( ema1 > 86.8261 )
		if( Typical_Price <= 134.703 )
			if( ema3 <= 86.4505 )
				if( Negative_Money_Flow <= 1.1808e+07 )
					if( Money_Flow_Ratio <= 2.00167 )
						if( MFI <= 64.791 )
							if( tema <= 87.9288 )
								ret := -0.047619
							if( tema > 87.9288 )
								ret := 0.300000
						if( MFI > 64.791 )
							ret := -0.750000 // sell
					if( Money_Flow_Ratio > 2.00167 )
						if( Typical_Price <= 90.4561 )
							if( Positive_Money_Flow_Sum <= 7.73521e+07 )
								if( Negative_Money_Flow_Sum <= 1.05392e+07 )
									ret := -0.187500
								if( Negative_Money_Flow_Sum > 1.05392e+07 )
									ret := 0.600000
							if( Positive_Money_Flow_Sum > 7.73521e+07 )
								if( Negative_Money_Flow <= 6.04504e+06 )
									ret := 0.945946 // buy
								if( Negative_Money_Flow > 6.04504e+06 )
									ret := 0.000000
						if( Typical_Price > 90.4561 )
							ret := -0.100000
				if( Negative_Money_Flow > 1.1808e+07 )
					ret := -0.533333
			if( ema3 > 86.4505 )
				if( Negative_Money_Flow <= 5.52582e+06 )
					if( ema13 <= -0.166626 )
						if( ema12 <= -1.30848 )
							if( Money_Flow_Ratio <= 0.468168 )
								if( Negative_Money_Flow_Sum <= 9.78216e+07 )
									ret := 0.014085
								if( Negative_Money_Flow_Sum > 9.78216e+07 )
									ret := 0.891892 // buy
							if( Money_Flow_Ratio > 0.468168 )
								if( MFI_High <= -39.3808 )
									ret := -0.694444
								if( MFI_High > -39.3808 )
									ret := 0.147059
						if( ema12 > -1.30848 )
							if( Raw_Money_Flow <= 4.8337e+06 )
								if( Negative_Money_Flow <= 1.72729e+06 )
									ret := -0.092437
								if( Negative_Money_Flow > 1.72729e+06 )
									ret := -0.436266
							if( Raw_Money_Flow > 4.8337e+06 )
								if( Typical_Price <= 114.308 )
									ret := -0.643805
								if( Typical_Price > 114.308 )
									ret := -0.244898
					if( ema13 > -0.166626 )
						if( ema12 <= 2.12316 )
							if( Raw_Money_Flow <= 1.56347e+07 )
								if( Raw_Money_Flow <= 4.79865e+06 )
									ret := -0.092626
								if( Raw_Money_Flow > 4.79865e+06 )
									ret := -0.265882
							if( Raw_Money_Flow > 1.56347e+07 )
								if( Positive_Money_Flow_Sum <= 8.04322e+07 )
									ret := -0.411765
								if( Positive_Money_Flow_Sum > 8.04322e+07 )
									ret := 0.386207
						if( ema12 > 2.12316 )
							if( Typical_Price <= 113.744 )
								if( ema3 <= 96.7684 )
									ret := -0.909091 // sell
								if( ema3 > 96.7684 )
									ret := 0.111111
							if( Typical_Price > 113.744 )
								if( Money_Flow_Ratio <= 3.29833 )
									ret := -0.555556
								if( Money_Flow_Ratio > 3.29833 )
									ret := -0.939394 // sell
				if( Negative_Money_Flow > 5.52582e+06 )
					if( Raw_Money_Flow <= 1.6665e+07 )
						if( Positive_Money_Flow_Sum <= 5.5271e+07 )
							if( ema12 <= -1.57314 )
								if( Positive_Money_Flow_Sum <= 3.42593e+07 )
									ret := 0.514286
								if( Positive_Money_Flow_Sum > 3.42593e+07 )
									ret := 0.842105 // buy
							if( ema12 > -1.57314 )
								if( Raw_Money_Flow <= 5.89451e+06 )
									ret := -0.309091
								if( Raw_Money_Flow > 5.89451e+06 )
									ret := 0.200903
						if( Positive_Money_Flow_Sum > 5.5271e+07 )
							if( Positive_Money_Flow_Sum <= 1.51344e+08 )
								if( Positive_Money_Flow_Sum <= 1.4093e+08 )
									ret := -0.112016
								if( Positive_Money_Flow_Sum > 1.4093e+08 )
									ret := 0.916667 // buy
							if( Positive_Money_Flow_Sum > 1.51344e+08 )
								if( MFI_High <= -13.137 )
									ret := -0.971429 // sell
								if( MFI_High > -13.137 )
									ret := -0.133333
					if( Raw_Money_Flow > 1.6665e+07 )
						if( Positive_Money_Flow_Sum <= 2.68461e+07 )
							if( ema13 <= -2.46239 )
								ret := -0.250000
							if( ema13 > -2.46239 )
								ret := -0.100000
						if( Positive_Money_Flow_Sum > 2.68461e+07 )
							if( MFI <= 22.1299 )
								ret := 1.000000 // buy
							if( MFI > 22.1299 )
								if( MFI <= 27.1154 )
									ret := -0.416667
								if( MFI > 27.1154 )
									ret := 0.660000
		if( Typical_Price > 134.703 )
			if( Negative_Money_Flow_Sum <= 8.13566e+07 )
				ret := -0.681818
			if( Negative_Money_Flow_Sum > 8.13566e+07 )
				if( Positive_Money_Flow <= 1.12837e+06 )
					ret := -0.846154 // sell
				if( Positive_Money_Flow > 1.12837e+06 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_AVAXUSDT_30Min_db4b2948(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


