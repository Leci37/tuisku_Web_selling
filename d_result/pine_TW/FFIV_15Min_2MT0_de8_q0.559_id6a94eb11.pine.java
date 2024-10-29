//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: FFIV_15Min_2MT0_6a94eb11 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2MT0_6a94eb11", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_6a94eb11(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema2 <= 144.652 )
		if( Typical_Price <= 120.577 )
			if( Money_Flow_Ratio <= 6.28153 )
				if( ema13 <= 1.8931 )
					if( ema12 <= -0.830466 )
						if( Positive_Money_Flow_Sum <= 1.51789e+07 )
							if( ema13 <= -2.85384 )
								if( tema <= 102.007 )
									ret := 1.000000 // buy
								if( tema > 102.007 )
									ret := 0.666667
							if( ema13 > -2.85384 )
								if( MFI_Low <= -1.24398 )
									ret := 0.454545
								if( MFI_Low > -1.24398 )
									ret := -0.361111
						if( Positive_Money_Flow_Sum > 1.51789e+07 )
							if( Positive_Money_Flow_Sum <= 2.17511e+07 )
								if( tema <= 108.118 )
									ret := -1.000000 // sell
								if( tema > 108.118 )
									ret := -0.900000 // sell
							if( Positive_Money_Flow_Sum > 2.17511e+07 )
								if( Negative_Money_Flow_Sum <= 3.5834e+07 )
									ret := 0.235294
								if( Negative_Money_Flow_Sum > 3.5834e+07 )
									ret := -0.387097
					if( ema12 > -0.830466 )
						if( ema3 <= 113.967 )
							if( Positive_Money_Flow_Sum <= 1.09542e+07 )
								if( ema1 <= 106.932 )
									ret := -0.707317 // sell
								if( ema1 > 106.932 )
									ret := 0.054054
							if( Positive_Money_Flow_Sum > 1.09542e+07 )
								if( MFI_Low <= 47.8191 )
									ret := 0.440404
								if( MFI_Low > 47.8191 )
									ret := -0.034483
						if( ema3 > 113.967 )
							if( Negative_Money_Flow_Sum <= 4.87081e+07 )
								if( ema1 <= 114.942 )
									ret := -0.387097
								if( ema1 > 114.942 )
									ret := 0.084777
							if( Negative_Money_Flow_Sum > 4.87081e+07 )
								if( ema1 <= 115.524 )
									ret := -0.500000
								if( ema1 > 115.524 )
									ret := 0.396313
				if( ema13 > 1.8931 )
					if( MFI <= 83.2465 )
						if( ema12 <= 1.24816 )
							ret := -0.562500
						if( ema12 > 1.24816 )
							ret := -1.000000 // sell
					if( MFI > 83.2465 )
						if( ema12 <= 1.7003 )
							ret := 0.285714
						if( ema12 > 1.7003 )
							ret := -0.454545
			if( Money_Flow_Ratio > 6.28153 )
				if( ema12 <= 0.741347 )
					if( ema2 <= 119.066 )
						if( MFI <= 88.3374 )
							if( Raw_Money_Flow <= 2.17364e+06 )
								ret := 0.142857
							if( Raw_Money_Flow > 2.17364e+06 )
								if( tema <= 116.858 )
									ret := 0.500000
								if( tema > 116.858 )
									ret := 1.000000 // buy
						if( MFI > 88.3374 )
							if( MFI_Low <= 70.4112 )
								ret := 0.062500
							if( MFI_Low > 70.4112 )
								if( Typical_Price <= 117.18 )
									ret := 0.000000
								if( Typical_Price > 117.18 )
									ret := -0.416667
					if( ema2 > 119.066 )
						ret := 1.000000 // buy
				if( ema12 > 0.741347 )
					if( ema1 <= 113.856 )
						ret := 1.000000 // buy
					if( ema1 > 113.856 )
						if( Typical_Price <= 116.687 )
							ret := 1.000000 // buy
						if( Typical_Price > 116.687 )
							ret := 0.454545
		if( Typical_Price > 120.577 )
			if( Negative_Money_Flow_Sum <= 6.64121e+06 )
				if( Typical_Price <= 129.868 )
					if( ema3 <= 128.532 )
						if( ema13 <= 0.537829 )
							if( ema1 <= 123.197 )
								if( MFI_Low <= 63.8112 )
									ret := 0.035714
								if( MFI_Low > 63.8112 )
									ret := -0.818182 // sell
							if( ema1 > 123.197 )
								if( Typical_Price <= 127.989 )
									ret := 0.547009
								if( Typical_Price > 127.989 )
									ret := -0.025641
						if( ema13 > 0.537829 )
							if( Negative_Money_Flow_Sum <= 4.79169e+06 )
								if( Raw_Money_Flow <= 1.36281e+06 )
									ret := 0.458333
								if( Raw_Money_Flow > 1.36281e+06 )
									ret := 0.833333 // buy
							if( Negative_Money_Flow_Sum > 4.79169e+06 )
								if( tema <= 126.282 )
									ret := 0.656250
								if( tema > 126.282 )
									ret := 0.055556
					if( ema3 > 128.532 )
						if( ema3 <= 130.148 )
							if( Negative_Money_Flow <= 126242 )
								if( ema13 <= 0.226697 )
									ret := 0.590909
								if( ema13 > 0.226697 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 126242 )
								ret := 1.000000 // buy
						if( ema3 > 130.148 )
							ret := 0.153846
				if( Typical_Price > 129.868 )
					if( ema13 <= -0.536621 )
						if( ema13 <= -0.85622 )
							if( Money_Flow_Ratio <= 0.774007 )
								ret := 0.888889 // buy
							if( Money_Flow_Ratio > 0.774007 )
								ret := -0.066667
						if( ema13 > -0.85622 )
							if( MFI <= 40.5332 )
								ret := 0.500000
							if( MFI > 40.5332 )
								ret := 1.000000 // buy
					if( ema13 > -0.536621 )
						if( Negative_Money_Flow_Sum <= 6.06688e+06 )
							if( MFI <= 95.3436 )
								if( Raw_Money_Flow <= 8.4108e+06 )
									ret := 0.052347
								if( Raw_Money_Flow > 8.4108e+06 )
									ret := 0.622449
							if( MFI > 95.3436 )
								if( tema <= 140.038 )
									ret := 0.012346
								if( tema > 140.038 )
									ret := -0.620690
						if( Negative_Money_Flow_Sum > 6.06688e+06 )
							if( ema12 <= 0.186028 )
								if( Positive_Money_Flow_Sum <= 1.58456e+07 )
									ret := 0.240964
								if( Positive_Money_Flow_Sum > 1.58456e+07 )
									ret := -0.371429
							if( ema12 > 0.186028 )
								if( MFI_High <= 9.49359 )
									ret := 0.679389
								if( MFI_High > 9.49359 )
									ret := -0.100000
			if( Negative_Money_Flow_Sum > 6.64121e+06 )
				if( ema13 <= -1.3116 )
					if( MFI <= 16.205 )
						if( ema12 <= -0.885405 )
							if( Money_Flow_Ratio <= 0.116342 )
								if( Negative_Money_Flow_Sum <= 1.19606e+08 )
									ret := -0.156566
								if( Negative_Money_Flow_Sum > 1.19606e+08 )
									ret := 0.948718 // buy
							if( Money_Flow_Ratio > 0.116342 )
								if( Positive_Money_Flow <= 1.01797e+06 )
									ret := 0.681416
								if( Positive_Money_Flow > 1.01797e+06 )
									ret := -0.230769
						if( ema12 > -0.885405 )
							if( Positive_Money_Flow <= 1.71795e+06 )
								if( Negative_Money_Flow_Sum <= 7.28678e+07 )
									ret := -0.436782
								if( Negative_Money_Flow_Sum > 7.28678e+07 )
									ret := 0.700000 // buy
							if( Positive_Money_Flow > 1.71795e+06 )
								ret := -0.857143 // sell
					if( MFI > 16.205 )
						if( Raw_Money_Flow <= 1.9269e+06 )
							if( ema2 <= 138.898 )
								if( MFI_High <= -60.073 )
									ret := -0.925926 // sell
								if( MFI_High > -60.073 )
									ret := -0.186275
							if( ema2 > 138.898 )
								if( Positive_Money_Flow_Sum <= 7.73076e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 7.73076e+06 )
									ret := -0.791667 // sell
						if( Raw_Money_Flow > 1.9269e+06 )
							if( MFI <= 44.3934 )
								if( ema13 <= -3.27408 )
									ret := 0.684211
								if( ema13 > -3.27408 )
									ret := -0.288136
							if( MFI > 44.3934 )
								if( Negative_Money_Flow_Sum <= 5.71263e+07 )
									ret := 0.120370
								if( Negative_Money_Flow_Sum > 5.71263e+07 )
									ret := 1.000000 // buy
				if( ema13 > -1.3116 )
					if( ema12 <= 1.49331 )
						if( Negative_Money_Flow <= 1.28147e+07 )
							if( ema12 <= 1.29363 )
								if( Money_Flow_Ratio <= 0.128256 )
									ret := -0.182213
								if( Money_Flow_Ratio > 0.128256 )
									ret := 0.027669
							if( ema12 > 1.29363 )
								if( Negative_Money_Flow_Sum <= 3.11874e+07 )
									ret := 0.035714
								if( Negative_Money_Flow_Sum > 3.11874e+07 )
									ret := -0.846154 // sell
						if( Negative_Money_Flow > 1.28147e+07 )
							if( ema12 <= 0.531236 )
								if( ema13 <= -0.135392 )
									ret := 0.337313
								if( ema13 > -0.135392 )
									ret := 0.037221
							if( ema12 > 0.531236 )
								if( Raw_Money_Flow <= 2.03167e+07 )
									ret := 0.950000 // buy
								if( Raw_Money_Flow > 2.03167e+07 )
									ret := 0.800000 // buy
					if( ema12 > 1.49331 )
						if( Money_Flow_Ratio <= 2.38249 )
							if( ema13 <= 5.44822 )
								if( MFI_Low <= 39.6235 )
									ret := 0.250000
								if( MFI_Low > 39.6235 )
									ret := 0.894737 // buy
							if( ema13 > 5.44822 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 2.38249 )
							if( MFI <= 76.8039 )
								if( Negative_Money_Flow <= 1.71833e+06 )
									ret := 0.285714
								if( Negative_Money_Flow > 1.71833e+06 )
									ret := -0.727273 // sell
							if( MFI > 76.8039 )
								if( Negative_Money_Flow <= 4479.28 )
									ret := 0.208333
								if( Negative_Money_Flow > 4479.28 )
									ret := 1.000000 // buy
	if( ema2 > 144.652 )
		if( ema13 <= -0.067162 )
			if( ema12 <= -2.90972 )
				if( Typical_Price <= 165.242 )
					if( MFI_High <= -49.0568 )
						ret := -0.400000
					if( MFI_High > -49.0568 )
						ret := 0.818182 // buy
				if( Typical_Price > 165.242 )
					if( Positive_Money_Flow <= 2065.87 )
						if( Positive_Money_Flow_Sum <= 1.01941e+07 )
							ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 1.01941e+07 )
							if( Typical_Price <= 183.806 )
								ret := 0.058824
							if( Typical_Price > 183.806 )
								if( MFI <= 15.4669 )
									ret := -0.818182 // sell
								if( MFI > 15.4669 )
									ret := -0.954545 // sell
					if( Positive_Money_Flow > 2065.87 )
						if( Positive_Money_Flow <= 7.63267e+06 )
							if( ema1 <= 198.152 )
								ret := -1.000000 // sell
							if( ema1 > 198.152 )
								ret := -0.888889 // sell
						if( Positive_Money_Flow > 7.63267e+06 )
							ret := -0.812500 // sell
			if( ema12 > -2.90972 )
				if( Negative_Money_Flow <= 4.15784e+06 )
					if( MFI <= 17.8671 )
						if( Positive_Money_Flow_Sum <= 4.3537e+06 )
							if( MFI_Low <= -4.50034 )
								if( Negative_Money_Flow_Sum <= 1.36232e+07 )
									ret := -0.602151
								if( Negative_Money_Flow_Sum > 1.36232e+07 )
									ret := -0.086420
							if( MFI_Low > -4.50034 )
								if( Typical_Price <= 183.714 )
									ret := 0.100000
								if( Typical_Price > 183.714 )
									ret := 0.645833
						if( Positive_Money_Flow_Sum > 4.3537e+06 )
							if( ema1 <= 167.512 )
								if( ema12 <= -2.8e-05 )
									ret := 0.029966
								if( ema12 > -2.8e-05 )
									ret := 0.950000 // buy
							if( ema1 > 167.512 )
								if( ema2 <= 202.681 )
									ret := 0.328205
								if( ema2 > 202.681 )
									ret := -0.011976
					if( MFI > 17.8671 )
						if( Money_Flow_Ratio <= 0.795248 )
							if( Negative_Money_Flow <= 1.86009e+06 )
								if( MFI_High <= -39.4606 )
									ret := -0.025781
								if( MFI_High > -39.4606 )
									ret := -0.134670
							if( Negative_Money_Flow > 1.86009e+06 )
								if( Typical_Price <= 143.945 )
									ret := 0.826087 // buy
								if( Typical_Price > 143.945 )
									ret := -0.190640
						if( Money_Flow_Ratio > 0.795248 )
							if( MFI <= 44.6106 )
								if( Positive_Money_Flow_Sum <= 2.12002e+07 )
									ret := 0.115385
								if( Positive_Money_Flow_Sum > 2.12002e+07 )
									ret := 0.695652
							if( MFI > 44.6106 )
								if( Money_Flow_Ratio <= 1.53717 )
									ret := 0.038418
								if( Money_Flow_Ratio > 1.53717 )
									ret := -0.034830
				if( Negative_Money_Flow > 4.15784e+06 )
					if( ema2 <= 153.423 )
						if( ema12 <= -0.06665 )
							if( ema12 <= -2.17135 )
								ret := 1.000000 // buy
							if( ema12 > -2.17135 )
								if( Negative_Money_Flow_Sum <= 3.46502e+07 )
									ret := -0.338776
								if( Negative_Money_Flow_Sum > 3.46502e+07 )
									ret := 0.004640
						if( ema12 > -0.06665 )
							if( Negative_Money_Flow <= 1.12558e+07 )
								ret := 0.294118
							if( Negative_Money_Flow > 1.12558e+07 )
								if( ema12 <= -0.036249 )
									ret := 0.700000 // buy
								if( ema12 > -0.036249 )
									ret := 0.900000 // buy
					if( ema2 > 153.423 )
						if( Raw_Money_Flow <= 4.39747e+07 )
							if( MFI_Low <= 10.3688 )
								if( Raw_Money_Flow <= 1.07937e+07 )
									ret := 0.075597
								if( Raw_Money_Flow > 1.07937e+07 )
									ret := 0.264669
							if( MFI_Low > 10.3688 )
								if( ema3 <= 221.162 )
									ret := 0.363363
								if( ema3 > 221.162 )
									ret := -0.255814
						if( Raw_Money_Flow > 4.39747e+07 )
							if( ema1 <= 195.092 )
								if( MFI_High <= -64.2057 )
									ret := 0.202899
								if( MFI_High > -64.2057 )
									ret := -0.636364
							if( ema1 > 195.092 )
								if( Positive_Money_Flow_Sum <= 1.37594e+07 )
									ret := -0.941176 // sell
								if( Positive_Money_Flow_Sum > 1.37594e+07 )
									ret := -0.400000
		if( ema13 > -0.067162 )
			if( Negative_Money_Flow_Sum <= 9.12622e+07 )
				if( MFI_Low <= 44.5396 )
					if( MFI_Low <= 2.16636 )
						if( MFI <= 16.68 )
							if( Negative_Money_Flow <= 1.3365e+07 )
								if( MFI_Low <= -4.41951 )
									ret := 0.017964
								if( MFI_Low > -4.41951 )
									ret := -0.507937
							if( Negative_Money_Flow > 1.3365e+07 )
								if( Money_Flow_Ratio <= 0.160138 )
									ret := -0.933333 // sell
								if( Money_Flow_Ratio > 0.160138 )
									ret := -0.217391
						if( MFI > 16.68 )
							if( Negative_Money_Flow_Sum <= 3.15866e+07 )
								if( tema <= 191.104 )
									ret := -0.278351
								if( tema > 191.104 )
									ret := 0.857143 // buy
							if( Negative_Money_Flow_Sum > 3.15866e+07 )
								if( tema <= 176.796 )
									ret := 0.385845
								if( tema > 176.796 )
									ret := 0.034483
					if( MFI_Low > 2.16636 )
						if( Positive_Money_Flow <= 7.70739e+06 )
							if( Negative_Money_Flow <= 5.6493e+07 )
								if( Negative_Money_Flow_Sum <= 2.63071e+07 )
									ret := -0.071068
								if( Negative_Money_Flow_Sum > 2.63071e+07 )
									ret := -0.141637
							if( Negative_Money_Flow > 5.6493e+07 )
								if( MFI_Low <= 13.2872 )
									ret := 1.000000 // buy
								if( MFI_Low > 13.2872 )
									ret := 0.222222
						if( Positive_Money_Flow > 7.70739e+06 )
							if( Raw_Money_Flow <= 2.60141e+07 )
								if( Money_Flow_Ratio <= 0.61508 )
									ret := 0.142857
								if( Money_Flow_Ratio > 0.61508 )
									ret := -0.537736
							if( Raw_Money_Flow > 2.60141e+07 )
								if( ema1 <= 182.466 )
									ret := 0.736842 // buy
								if( ema1 > 182.466 )
									ret := -0.714286 // sell
				if( MFI_Low > 44.5396 )
					if( ema13 <= 0.704621 )
						if( MFI_Low <= 56.967 )
							if( MFI_Low <= 52.5118 )
								if( Negative_Money_Flow <= 736726 )
									ret := -0.064927
								if( Negative_Money_Flow > 736726 )
									ret := 0.175692
							if( MFI_Low > 52.5118 )
								if( Raw_Money_Flow <= 1.67106e+07 )
									ret := 0.177179
								if( Raw_Money_Flow > 1.67106e+07 )
									ret := -0.296703
						if( MFI_Low > 56.967 )
							if( tema <= 153.392 )
								if( Money_Flow_Ratio <= 9.29981 )
									ret := -0.219269
								if( Money_Flow_Ratio > 9.29981 )
									ret := 0.400000
							if( tema > 153.392 )
								if( Positive_Money_Flow_Sum <= 4.20349e+07 )
									ret := 0.120546
								if( Positive_Money_Flow_Sum > 4.20349e+07 )
									ret := -0.083766
					if( ema13 > 0.704621 )
						if( Negative_Money_Flow_Sum <= 2.68539e+07 )
							if( ema13 <= 4.18549 )
								if( Positive_Money_Flow_Sum <= 1.59064e+08 )
									ret := -0.080622
								if( Positive_Money_Flow_Sum > 1.59064e+08 )
									ret := -0.857143 // sell
							if( ema13 > 4.18549 )
								if( MFI_High <= 2.662 )
									ret := 0.230769
								if( MFI_High > 2.662 )
									ret := 0.702703 // buy
						if( Negative_Money_Flow_Sum > 2.68539e+07 )
							if( Positive_Money_Flow_Sum <= 1.37844e+08 )
								if( Positive_Money_Flow <= 1.10689e+07 )
									ret := 0.447917
								if( Positive_Money_Flow > 1.10689e+07 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.37844e+08 )
								if( MFI <= 86.1921 )
									ret := -0.956522 // sell
								if( MFI > 86.1921 )
									ret := 0.363636
			if( Negative_Money_Flow_Sum > 9.12622e+07 )
				if( ema13 <= 3.02735 )
					if( Typical_Price <= 202.887 )
						if( ema13 <= 1.80692 )
							if( Raw_Money_Flow <= 359988 )
								if( ema2 <= 168.759 )
									ret := 0.363636
								if( ema2 > 168.759 )
									ret := 0.928571 // buy
							if( Raw_Money_Flow > 359988 )
								if( ema1 <= 198.92 )
									ret := 0.104704
								if( ema1 > 198.92 )
									ret := 0.705882 // buy
						if( ema13 > 1.80692 )
							if( ema2 <= 168.438 )
								ret := 0.333333
							if( ema2 > 168.438 )
								if( Negative_Money_Flow_Sum <= 1.05154e+08 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 1.05154e+08 )
									ret := 1.000000 // buy
					if( Typical_Price > 202.887 )
						if( MFI_Low <= 2.5533 )
							if( MFI_High <= -61.0821 )
								if( tema <= 221.687 )
									ret := 0.038462
								if( tema > 221.687 )
									ret := -0.692308
							if( MFI_High > -61.0821 )
								ret := 0.666667
						if( MFI_Low > 2.5533 )
							if( ema13 <= 1.60767 )
								ret := -0.454545
							if( ema13 > 1.60767 )
								ret := -0.888889 // sell
				if( ema13 > 3.02735 )
					if( MFI <= 56.0885 )
						if( tema <= 192.821 )
							ret := -0.750000 // sell
						if( tema > 192.821 )
							ret := -1.000000 // sell
					if( MFI > 56.0885 )
						ret := -0.214286
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_FFIV_15Min_6a94eb11(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


