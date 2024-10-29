//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: MATICUSDT_30Min_1M00_5cbd54c6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1M00_5cbd54c6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_5cbd54c6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 1.94238e+06 )
		if( Raw_Money_Flow <= 1.9622e+07 )
			if( Positive_Money_Flow_Sum <= 1.17973e+06 )
				if( Money_Flow_Ratio <= 2.83879 )
					if( Negative_Money_Flow <= 44216.9 )
						if( Money_Flow_Ratio <= 0.280455 )
							if( MFI <= 18.1413 )
								if( Negative_Money_Flow <= 29735.9 )
									ret := -0.127358
								if( Negative_Money_Flow > 29735.9 )
									ret := 0.307692
							if( MFI > 18.1413 )
								if( Positive_Money_Flow <= 258113 )
									ret := -0.265537
								if( Positive_Money_Flow > 258113 )
									ret := -0.793103 // sell
						if( Money_Flow_Ratio > 0.280455 )
							if( Money_Flow_Ratio <= 1.21289 )
								if( Positive_Money_Flow_Sum <= 173569 )
									ret := -0.042184
								if( Positive_Money_Flow_Sum > 173569 )
									ret := 0.130629
							if( Money_Flow_Ratio > 1.21289 )
								if( MFI_High <= -18.0069 )
									ret := -0.135508
								if( MFI_High > -18.0069 )
									ret := 0.090992
					if( Negative_Money_Flow > 44216.9 )
						if( Money_Flow_Ratio <= 0.95682 )
							if( Raw_Money_Flow <= 129995 )
								if( MFI_High <= -46.9422 )
									ret := -0.161417
								if( MFI_High > -46.9422 )
									ret := 0.122150
							if( Raw_Money_Flow > 129995 )
								if( Negative_Money_Flow_Sum <= 2.8031e+06 )
									ret := 0.303030
								if( Negative_Money_Flow_Sum > 2.8031e+06 )
									ret := -0.061798
						if( Money_Flow_Ratio > 0.95682 )
							if( Positive_Money_Flow_Sum <= 624275 )
								if( MFI <= 52.1439 )
									ret := -0.122807
								if( MFI > 52.1439 )
									ret := 0.277228
							if( Positive_Money_Flow_Sum > 624275 )
								if( Negative_Money_Flow <= 238900 )
									ret := 0.513158
								if( Negative_Money_Flow > 238900 )
									ret := -0.347826
				if( Money_Flow_Ratio > 2.83879 )
					if( Typical_Price <= 0.01673 )
						if( Positive_Money_Flow <= 51215.5 )
							if( Money_Flow_Ratio <= 3.09665 )
								ret := -0.384615
							if( Money_Flow_Ratio > 3.09665 )
								if( Typical_Price <= 0.013397 )
									ret := -0.500000
								if( Typical_Price > 0.013397 )
									ret := 0.675000
						if( Positive_Money_Flow > 51215.5 )
							if( MFI_Low <= 64.2578 )
								ret := 0.111111
							if( MFI_Low > 64.2578 )
								ret := -0.705882 // sell
					if( Typical_Price > 0.01673 )
						if( Negative_Money_Flow_Sum <= 353334 )
							if( MFI_Low <= 56.7963 )
								if( Negative_Money_Flow_Sum <= 113641 )
									ret := 0.228571
								if( Negative_Money_Flow_Sum > 113641 )
									ret := -0.674556
							if( MFI_Low > 56.7963 )
								if( Positive_Money_Flow_Sum <= 991719 )
									ret := -0.143617
								if( Positive_Money_Flow_Sum > 991719 )
									ret := -0.526316
						if( Negative_Money_Flow_Sum > 353334 )
							ret := 0.545455
			if( Positive_Money_Flow_Sum > 1.17973e+06 )
				if( Typical_Price <= 0.878709 )
					if( Raw_Money_Flow <= 1.02145e+07 )
						if( Raw_Money_Flow <= 2.34217e+06 )
							if( Positive_Money_Flow_Sum <= 7.41808e+06 )
								if( Negative_Money_Flow_Sum <= 632125 )
									ret := -0.252212
								if( Negative_Money_Flow_Sum > 632125 )
									ret := -0.010552
							if( Positive_Money_Flow_Sum > 7.41808e+06 )
								if( Typical_Price <= 0.107662 )
									ret := 0.288889
								if( Typical_Price > 0.107662 )
									ret := 0.058597
						if( Raw_Money_Flow > 2.34217e+06 )
							if( MFI_Low <= 1.33277 )
								if( Typical_Price <= 0.502554 )
									ret := -0.263158
								if( Typical_Price > 0.502554 )
									ret := 0.690476
							if( MFI_Low > 1.33277 )
								if( Raw_Money_Flow <= 2.8389e+06 )
									ret := -0.249166
								if( Raw_Money_Flow > 2.8389e+06 )
									ret := -0.050990
					if( Raw_Money_Flow > 1.02145e+07 )
						if( Money_Flow_Ratio <= 1.05833 )
							if( Money_Flow_Ratio <= 0.677421 )
								ret := 0.300000
							if( Money_Flow_Ratio > 0.677421 )
								if( Positive_Money_Flow_Sum <= 1.08158e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.08158e+08 )
									ret := 0.652174
						if( Money_Flow_Ratio > 1.05833 )
							if( MFI <= 88.1588 )
								if( Negative_Money_Flow_Sum <= 7.22406e+07 )
									ret := -0.094595
								if( Negative_Money_Flow_Sum > 7.22406e+07 )
									ret := 0.909091 // buy
							if( MFI > 88.1588 )
								if( Negative_Money_Flow_Sum <= 3.35065e+06 )
									ret := 0.307692
								if( Negative_Money_Flow_Sum > 3.35065e+06 )
									ret := 1.000000 // buy
				if( Typical_Price > 0.878709 )
					if( MFI_Low <= -8.72756 )
						if( Typical_Price <= 1.24953 )
							if( Money_Flow_Ratio <= 0.114669 )
								ret := 0.615385
							if( Money_Flow_Ratio > 0.114669 )
								ret := 0.800000 // buy
						if( Typical_Price > 1.24953 )
							ret := 0.384615
					if( MFI_Low > -8.72756 )
						if( MFI_High <= -46.9296 )
							if( Negative_Money_Flow_Sum <= 9.63392e+07 )
								if( Positive_Money_Flow <= 5.95105e+06 )
									ret := -0.127363
								if( Positive_Money_Flow > 5.95105e+06 )
									ret := -0.430556
							if( Negative_Money_Flow_Sum > 9.63392e+07 )
								if( Positive_Money_Flow_Sum <= 5.35857e+07 )
									ret := 0.631579
								if( Positive_Money_Flow_Sum > 5.35857e+07 )
									ret := -0.372727
						if( MFI_High > -46.9296 )
							if( Positive_Money_Flow_Sum <= 1.43316e+08 )
								if( Negative_Money_Flow_Sum <= 1.70266e+08 )
									ret := -0.036224
								if( Negative_Money_Flow_Sum > 1.70266e+08 )
									ret := 0.954545 // buy
							if( Positive_Money_Flow_Sum > 1.43316e+08 )
								if( Money_Flow_Ratio <= 3.10286 )
									ret := -0.463235
								if( Money_Flow_Ratio > 3.10286 )
									ret := 0.027586
		if( Raw_Money_Flow > 1.9622e+07 )
			if( MFI_Low <= 54.7137 )
				if( Typical_Price <= 1.86005 )
					if( Typical_Price <= 0.777547 )
						if( Raw_Money_Flow <= 2.23543e+07 )
							ret := -0.642857
						if( Raw_Money_Flow > 2.23543e+07 )
							ret := -0.920000 // sell
					if( Typical_Price > 0.777547 )
						if( Positive_Money_Flow <= 8.41197e+07 )
							if( Positive_Money_Flow_Sum <= 3.46421e+08 )
								if( Positive_Money_Flow <= 5.96926e+07 )
									ret := -0.037190
								if( Positive_Money_Flow > 5.96926e+07 )
									ret := -0.851852 // sell
							if( Positive_Money_Flow_Sum > 3.46421e+08 )
								if( Positive_Money_Flow <= 3.45488e+07 )
									ret := 0.230769
								if( Positive_Money_Flow > 3.45488e+07 )
									ret := -0.746269 // sell
						if( Positive_Money_Flow > 8.41197e+07 )
							if( Money_Flow_Ratio <= 2.06521 )
								ret := 0.533333
							if( Money_Flow_Ratio > 2.06521 )
								ret := 1.000000 // buy
				if( Typical_Price > 1.86005 )
					if( Negative_Money_Flow_Sum <= 4.68535e+07 )
						ret := 0.500000
					if( Negative_Money_Flow_Sum > 4.68535e+07 )
						if( Negative_Money_Flow_Sum <= 5.20071e+08 )
							if( MFI <= 47.9845 )
								if( Positive_Money_Flow <= 4.55106e+07 )
									ret := -0.927083 // sell
								if( Positive_Money_Flow > 4.55106e+07 )
									ret := -0.666667
							if( MFI > 47.9845 )
								if( MFI_Low <= 35.3225 )
									ret := 0.184211
								if( MFI_Low > 35.3225 )
									ret := -0.734513 // sell
						if( Negative_Money_Flow_Sum > 5.20071e+08 )
							if( Negative_Money_Flow_Sum <= 6.42748e+08 )
								if( Positive_Money_Flow_Sum <= 2.99068e+08 )
									ret := 0.583333
								if( Positive_Money_Flow_Sum > 2.99068e+08 )
									ret := 0.842105 // buy
							if( Negative_Money_Flow_Sum > 6.42748e+08 )
								ret := -1.000000 // sell
			if( MFI_Low > 54.7137 )
				if( Negative_Money_Flow_Sum <= 6.75778e+07 )
					if( Positive_Money_Flow <= 4.81106e+07 )
						if( Positive_Money_Flow_Sum <= 2.45886e+08 )
							if( Negative_Money_Flow_Sum <= 4.72886e+07 )
								if( MFI_High <= -0.114873 )
									ret := 0.413793
								if( MFI_High > -0.114873 )
									ret := -0.278261
							if( Negative_Money_Flow_Sum > 4.72886e+07 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.45886e+08 )
							ret := 0.937500 // buy
					if( Positive_Money_Flow > 4.81106e+07 )
						if( Positive_Money_Flow <= 6.70732e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 6.70732e+07 )
							ret := -0.666667
				if( Negative_Money_Flow_Sum > 6.75778e+07 )
					if( Negative_Money_Flow_Sum <= 1.17155e+08 )
						if( Raw_Money_Flow <= 2.3662e+07 )
							ret := 0.000000
						if( Raw_Money_Flow > 2.3662e+07 )
							if( Typical_Price <= 1.12974 )
								ret := 0.400000
							if( Typical_Price > 1.12974 )
								if( Raw_Money_Flow <= 4.2127e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 4.2127e+07 )
									ret := 0.833333 // buy
					if( Negative_Money_Flow_Sum > 1.17155e+08 )
						if( Raw_Money_Flow <= 6.57983e+07 )
							ret := -0.583333
						if( Raw_Money_Flow > 6.57983e+07 )
							if( Negative_Money_Flow_Sum <= 1.58646e+08 )
								ret := -0.300000
							if( Negative_Money_Flow_Sum > 1.58646e+08 )
								ret := 0.850000 // buy
	if( Negative_Money_Flow > 1.94238e+06 )
		if( Typical_Price <= 1.81974 )
			if( MFI_Low <= 24.535 )
				if( Positive_Money_Flow_Sum <= 7.7931e+07 )
					if( Raw_Money_Flow <= 1.84391e+07 )
						if( Typical_Price <= 1.43457 )
							if( MFI <= 44.0482 )
								if( Positive_Money_Flow_Sum <= 8.84457e+06 )
									ret := 0.035539
								if( Positive_Money_Flow_Sum > 8.84457e+06 )
									ret := 0.207722
							if( MFI > 44.0482 )
								if( Raw_Money_Flow <= 3.1456e+06 )
									ret := 0.108108
								if( Raw_Money_Flow > 3.1456e+06 )
									ret := 0.700000 // buy
						if( Typical_Price > 1.43457 )
							if( Negative_Money_Flow_Sum <= 1.42391e+08 )
								if( Positive_Money_Flow_Sum <= 3.23713e+07 )
									ret := 0.087719
								if( Positive_Money_Flow_Sum > 3.23713e+07 )
									ret := -0.119804
							if( Negative_Money_Flow_Sum > 1.42391e+08 )
								if( Positive_Money_Flow_Sum <= 6.14269e+07 )
									ret := -0.526316
								if( Positive_Money_Flow_Sum > 6.14269e+07 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 1.84391e+07 )
						if( MFI_High <= -52.0368 )
							if( MFI_High <= -65.102 )
								if( Typical_Price <= 0.943431 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.943431 )
									ret := -0.628571
							if( MFI_High > -65.102 )
								if( MFI <= 20.497 )
									ret := 0.591549
								if( MFI > 20.497 )
									ret := 0.911392 // buy
						if( MFI_High > -52.0368 )
							if( Raw_Money_Flow <= 2.06934e+07 )
								ret := 0.687500
							if( Raw_Money_Flow > 2.06934e+07 )
								if( Typical_Price <= 1.04846 )
									ret := 0.266667
								if( Typical_Price > 1.04846 )
									ret := -0.659091
				if( Positive_Money_Flow_Sum > 7.7931e+07 )
					if( Raw_Money_Flow <= 4.17382e+07 )
						if( Raw_Money_Flow <= 1.70841e+07 )
							if( Negative_Money_Flow <= 8.77214e+06 )
								if( Negative_Money_Flow_Sum <= 1.49744e+08 )
									ret := -0.066667
								if( Negative_Money_Flow_Sum > 1.49744e+08 )
									ret := 0.846154 // buy
							if( Negative_Money_Flow > 8.77214e+06 )
								if( MFI_Low <= 18.7494 )
									ret := 0.591837
								if( MFI_Low > 18.7494 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.70841e+07 )
							if( MFI <= 30.3287 )
								if( MFI_High <= -53.4602 )
									ret := -0.047619
								if( MFI_High > -53.4602 )
									ret := 0.666667
							if( MFI > 30.3287 )
								if( Positive_Money_Flow_Sum <= 2.14775e+08 )
									ret := -0.035398
								if( Positive_Money_Flow_Sum > 2.14775e+08 )
									ret := 0.629630
					if( Raw_Money_Flow > 4.17382e+07 )
						if( Money_Flow_Ratio <= 0.622444 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.622444 )
							if( Positive_Money_Flow_Sum <= 4.73691e+08 )
								ret := 0.200000
							if( Positive_Money_Flow_Sum > 4.73691e+08 )
								ret := 1.000000 // buy
			if( MFI_Low > 24.535 )
				if( Money_Flow_Ratio <= 3.2522 )
					if( Negative_Money_Flow <= 4.391e+06 )
						if( Typical_Price <= 0.481322 )
							if( Money_Flow_Ratio <= 2.82218 )
								if( MFI <= 52.5523 )
									ret := 0.521429
								if( MFI > 52.5523 )
									ret := 0.170868
							if( Money_Flow_Ratio > 2.82218 )
								if( MFI <= 75.3943 )
									ret := -0.823529 // sell
								if( MFI > 75.3943 )
									ret := -0.090909
						if( Typical_Price > 0.481322 )
							if( MFI <= 46.5059 )
								if( MFI_High <= -34.3241 )
									ret := -0.069307
								if( MFI_High > -34.3241 )
									ret := -0.283237
							if( MFI > 46.5059 )
								if( Negative_Money_Flow_Sum <= 1.44477e+07 )
									ret := -0.054698
								if( Negative_Money_Flow_Sum > 1.44477e+07 )
									ret := 0.103462
					if( Negative_Money_Flow > 4.391e+06 )
						if( MFI <= 45.0077 )
							if( Typical_Price <= 1.25948 )
								if( Positive_Money_Flow_Sum <= 2.98733e+07 )
									ret := -0.117647
								if( Positive_Money_Flow_Sum > 2.98733e+07 )
									ret := -0.829787 // sell
							if( Typical_Price > 1.25948 )
								if( MFI_High <= -35.1188 )
									ret := 0.375000
								if( MFI_High > -35.1188 )
									ret := -0.818182 // sell
						if( MFI > 45.0077 )
							if( Positive_Money_Flow_Sum <= 1.84246e+07 )
								if( Negative_Money_Flow_Sum <= 1.51248e+07 )
									ret := 0.088889
								if( Negative_Money_Flow_Sum > 1.51248e+07 )
									ret := 0.617647
							if( Positive_Money_Flow_Sum > 1.84246e+07 )
								if( Positive_Money_Flow_Sum <= 5.36284e+07 )
									ret := -0.144813
								if( Positive_Money_Flow_Sum > 5.36284e+07 )
									ret := 0.002445
				if( Money_Flow_Ratio > 3.2522 )
					if( MFI_High <= -3.26158 )
						if( Negative_Money_Flow_Sum <= 1.47478e+07 )
							ret := 0.461538
						if( Negative_Money_Flow_Sum > 1.47478e+07 )
							ret := 1.000000 // buy
					if( MFI_High > -3.26158 )
						if( Positive_Money_Flow_Sum <= 4.33457e+07 )
							if( Typical_Price <= 1.06089 )
								if( Positive_Money_Flow_Sum <= 3.99009e+07 )
									ret := 0.336283
								if( Positive_Money_Flow_Sum > 3.99009e+07 )
									ret := -0.909091 // sell
							if( Typical_Price > 1.06089 )
								if( MFI <= 80.7217 )
									ret := -0.837838 // sell
								if( MFI > 80.7217 )
									ret := -0.218750
						if( Positive_Money_Flow_Sum > 4.33457e+07 )
							if( Positive_Money_Flow_Sum <= 5.33292e+07 )
								if( MFI <= 79.1733 )
									ret := 0.754386 // buy
								if( MFI > 79.1733 )
									ret := 0.378788
							if( Positive_Money_Flow_Sum > 5.33292e+07 )
								if( Negative_Money_Flow <= 1.47997e+07 )
									ret := 0.110266
								if( Negative_Money_Flow > 1.47997e+07 )
									ret := 0.666667
		if( Typical_Price > 1.81974 )
			if( Positive_Money_Flow_Sum <= 6.53364e+08 )
				if( Positive_Money_Flow_Sum <= 3.8989e+08 )
					if( Positive_Money_Flow <= 1.14854e+07 )
						if( Raw_Money_Flow <= 4.71235e+07 )
							if( Negative_Money_Flow_Sum <= 1.3634e+08 )
								if( Positive_Money_Flow_Sum <= 4.79348e+07 )
									ret := -0.135740
								if( Positive_Money_Flow_Sum > 4.79348e+07 )
									ret := 0.139276
							if( Negative_Money_Flow_Sum > 1.3634e+08 )
								if( Typical_Price <= 2.21785 )
									ret := -0.557423
								if( Typical_Price > 2.21785 )
									ret := 0.363636
						if( Raw_Money_Flow > 4.71235e+07 )
							if( Typical_Price <= 2.0109 )
								if( MFI_High <= -44.9486 )
									ret := 1.000000 // buy
								if( MFI_High > -44.9486 )
									ret := 0.800000 // buy
							if( Typical_Price > 2.0109 )
								if( Negative_Money_Flow_Sum <= 4.12343e+08 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 4.12343e+08 )
									ret := -0.333333
					if( Positive_Money_Flow > 1.14854e+07 )
						ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 3.8989e+08 )
					if( Negative_Money_Flow <= 5.74965e+07 )
						if( Positive_Money_Flow_Sum <= 5.21329e+08 )
							if( Typical_Price <= 1.88896 )
								ret := 0.363636
							if( Typical_Price > 1.88896 )
								if( MFI_Low <= 43.6487 )
									ret := 1.000000 // buy
								if( MFI_Low > 43.6487 )
									ret := 0.904762 // buy
						if( Positive_Money_Flow_Sum > 5.21329e+08 )
							ret := -0.222222
					if( Negative_Money_Flow > 5.74965e+07 )
						if( MFI <= 49.206 )
							ret := 0.777778 // buy
						if( MFI > 49.206 )
							if( Negative_Money_Flow_Sum <= 3.26172e+08 )
								ret := -0.272727
							if( Negative_Money_Flow_Sum > 3.26172e+08 )
								ret := -0.894737 // sell
			if( Positive_Money_Flow_Sum > 6.53364e+08 )
				if( MFI_Low <= 41.9721 )
					if( Money_Flow_Ratio <= 0.790667 )
						ret := -0.714286 // sell
					if( Money_Flow_Ratio > 0.790667 )
						if( MFI_Low <= 34.728 )
							ret := -1.000000 // sell
						if( MFI_Low > 34.728 )
							ret := -0.818182 // sell
				if( MFI_Low > 41.9721 )
					if( MFI <= 64.2985 )
						ret := 0.375000
					if( MFI > 64.2985 )
						ret := -0.600000
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_5cbd54c6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


