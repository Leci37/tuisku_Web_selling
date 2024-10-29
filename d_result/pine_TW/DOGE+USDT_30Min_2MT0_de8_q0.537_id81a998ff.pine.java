//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: DOGEUSDT_30Min_2MT0_81a998ff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2MT0_81a998ff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_81a998ff(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( tema <= 0.068161 )
		if( ema12 <= -0.000139 )
			if( Raw_Money_Flow <= 998709 )
				if( ema3 <= 0.009579 )
					if( ema3 <= 0.004506 )
						ret := 0.066667
					if( ema3 > 0.004506 )
						if( Positive_Money_Flow_Sum <= 3.82217e+06 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 3.82217e+06 )
							ret := 0.250000
				if( ema3 > 0.009579 )
					if( Positive_Money_Flow_Sum <= 4.18623e+06 )
						if( MFI_High <= -53.4748 )
							if( Typical_Price <= 0.060269 )
								if( Positive_Money_Flow_Sum <= 1.38577e+06 )
									ret := -0.304348
								if( Positive_Money_Flow_Sum > 1.38577e+06 )
									ret := -0.746667 // sell
							if( Typical_Price > 0.060269 )
								if( tema <= 0.067268 )
									ret := -0.180556
								if( tema > 0.067268 )
									ret := 0.333333
						if( MFI_High > -53.4748 )
							if( ema3 <= 0.063108 )
								if( Positive_Money_Flow <= 444565 )
									ret := 0.257282
								if( Positive_Money_Flow > 444565 )
									ret := -0.164557
							if( ema3 > 0.063108 )
								if( ema12 <= -0.000167 )
									ret := -0.309091
								if( ema12 > -0.000167 )
									ret := 0.104167
					if( Positive_Money_Flow_Sum > 4.18623e+06 )
						if( MFI <= 25.8945 )
							if( ema13 <= -0.001249 )
								ret := -0.687500
							if( ema13 > -0.001249 )
								if( Typical_Price <= 0.059839 )
									ret := -0.700000 // sell
								if( Typical_Price > 0.059839 )
									ret := -0.033333
						if( MFI > 25.8945 )
							if( Positive_Money_Flow <= 970181 )
								if( Raw_Money_Flow <= 755646 )
									ret := 0.060942
								if( Raw_Money_Flow > 755646 )
									ret := 0.340000
							if( Positive_Money_Flow > 970181 )
								ret := -0.818182 // sell
			if( Raw_Money_Flow > 998709 )
				if( MFI <= 12.2604 )
					if( Positive_Money_Flow_Sum <= 7.2976e+06 )
						if( ema12 <= -0.000661 )
							if( Raw_Money_Flow <= 1.35429e+06 )
								ret := -0.200000
							if( Raw_Money_Flow > 1.35429e+06 )
								if( Negative_Money_Flow_Sum <= 1.89784e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.89784e+07 )
									ret := 0.000000
						if( ema12 > -0.000661 )
							if( ema12 <= -0.000503 )
								ret := -0.800000 // sell
							if( ema12 > -0.000503 )
								ret := -0.375000
					if( Positive_Money_Flow_Sum > 7.2976e+06 )
						ret := -1.000000 // sell
				if( MFI > 12.2604 )
					if( MFI_High <= -38.2442 )
						if( tema <= 0.045579 )
							if( ema12 <= -0.000387 )
								if( ema13 <= -0.000971 )
									ret := 0.718750 // buy
								if( ema13 > -0.000971 )
									ret := -0.392857
							if( ema12 > -0.000387 )
								if( Money_Flow_Ratio <= 0.358268 )
									ret := 0.384615
								if( Money_Flow_Ratio > 0.358268 )
									ret := 0.905660 // buy
						if( tema > 0.045579 )
							if( Positive_Money_Flow_Sum <= 1.62012e+07 )
								if( tema <= 0.053926 )
									ret := 0.561728
								if( tema > 0.053926 )
									ret := 0.286894
							if( Positive_Money_Flow_Sum > 1.62012e+07 )
								if( Typical_Price <= 0.04742 )
									ret := -0.764706 // sell
								if( Typical_Price > 0.04742 )
									ret := 0.164609
					if( MFI_High > -38.2442 )
						if( Positive_Money_Flow <= 5.6876e+07 )
							if( Negative_Money_Flow_Sum <= 2.0556e+08 )
								if( Money_Flow_Ratio <= 0.719305 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 0.719305 )
									ret := 0.142400
							if( Negative_Money_Flow_Sum > 2.0556e+08 )
								if( ema3 <= 0.048283 )
									ret := -0.800000 // sell
								if( ema3 > 0.048283 )
									ret := -0.103448
						if( Positive_Money_Flow > 5.6876e+07 )
							ret := 1.000000 // buy
		if( ema12 > -0.000139 )
			if( MFI <= 70.2054 )
				if( Negative_Money_Flow_Sum <= 9.32007e+07 )
					if( Raw_Money_Flow <= 1.63334e+06 )
						if( Money_Flow_Ratio <= 2.07015 )
							if( Positive_Money_Flow_Sum <= 6.73634e+06 )
								if( ema12 <= -5.8e-05 )
									ret := -0.061212
								if( ema12 > -5.8e-05 )
									ret := 0.047624
							if( Positive_Money_Flow_Sum > 6.73634e+06 )
								if( ema13 <= -0.00024 )
									ret := -0.272727
								if( ema13 > -0.00024 )
									ret := 0.183738
						if( Money_Flow_Ratio > 2.07015 )
							if( ema13 <= 2e-05 )
								if( Negative_Money_Flow_Sum <= 49397.7 )
									ret := 0.466667
								if( Negative_Money_Flow_Sum > 49397.7 )
									ret := -0.039548
							if( ema13 > 2e-05 )
								if( tema <= 0.059317 )
									ret := 0.434959
								if( tema > 0.059317 )
									ret := 0.180000
					if( Raw_Money_Flow > 1.63334e+06 )
						if( Negative_Money_Flow <= 2.0238e+07 )
							if( Negative_Money_Flow_Sum <= 2.55335e+07 )
								if( ema1 <= 0.062555 )
									ret := -0.226590
								if( ema1 > 0.062555 )
									ret := 0.047393
							if( Negative_Money_Flow_Sum > 2.55335e+07 )
								if( ema1 <= 0.028429 )
									ret := 0.800000 // buy
								if( ema1 > 0.028429 )
									ret := 0.032401
						if( Negative_Money_Flow > 2.0238e+07 )
							if( Negative_Money_Flow_Sum <= 6.3479e+07 )
								ret := -0.875000 // sell
							if( Negative_Money_Flow_Sum > 6.3479e+07 )
								ret := -0.941176 // sell
				if( Negative_Money_Flow_Sum > 9.32007e+07 )
					if( Positive_Money_Flow_Sum <= 2.37058e+08 )
						if( tema <= 0.056325 )
							if( ema1 <= 0.039871 )
								if( ema1 <= 0.039062 )
									ret := 0.744681 // buy
								if( ema1 > 0.039062 )
									ret := -0.500000
							if( ema1 > 0.039871 )
								if( Negative_Money_Flow <= 9.57617e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 9.57617e+06 )
									ret := 0.833333 // buy
						if( tema > 0.056325 )
							if( ema13 <= 0.001191 )
								if( ema1 <= 0.056617 )
									ret := -0.875000 // sell
								if( ema1 > 0.056617 )
									ret := 0.235294
							if( ema13 > 0.001191 )
								if( Negative_Money_Flow <= 9.64879e+06 )
									ret := 0.300000
								if( Negative_Money_Flow > 9.64879e+06 )
									ret := 0.812500 // buy
					if( Positive_Money_Flow_Sum > 2.37058e+08 )
						if( ema2 <= 0.027089 )
							ret := 0.789474 // buy
						if( ema2 > 0.027089 )
							if( ema3 <= 0.034957 )
								ret := -0.866667 // sell
							if( ema3 > 0.034957 )
								if( MFI_High <= -17.1166 )
									ret := 0.169492
								if( MFI_High > -17.1166 )
									ret := -0.518519
			if( MFI > 70.2054 )
				if( Raw_Money_Flow <= 1.38684e+08 )
					if( ema12 <= 0.000263 )
						if( Positive_Money_Flow_Sum <= 1.67071e+06 )
							if( tema <= 0.003892 )
								if( Positive_Money_Flow <= 283548 )
									ret := -0.048921
								if( Positive_Money_Flow > 283548 )
									ret := 1.000000 // buy
							if( tema > 0.003892 )
								if( Positive_Money_Flow <= 73071.6 )
									ret := -0.145833
								if( Positive_Money_Flow > 73071.6 )
									ret := -0.741573 // sell
						if( Positive_Money_Flow_Sum > 1.67071e+06 )
							if( ema3 <= 0.004181 )
								if( Money_Flow_Ratio <= 4.81543 )
									ret := 0.756757 // buy
								if( Money_Flow_Ratio > 4.81543 )
									ret := -0.900000 // sell
							if( ema3 > 0.004181 )
								if( ema2 <= 0.004733 )
									ret := -0.657143
								if( ema2 > 0.004733 )
									ret := 0.062323
					if( ema12 > 0.000263 )
						if( Negative_Money_Flow <= 3.88593e+06 )
							if( Negative_Money_Flow <= 1.29049e+06 )
								if( Negative_Money_Flow_Sum <= 4.89129e+06 )
									ret := -0.020305
								if( Negative_Money_Flow_Sum > 4.89129e+06 )
									ret := -0.213333
							if( Negative_Money_Flow > 1.29049e+06 )
								if( ema12 <= 0.000379 )
									ret := -0.250000
								if( ema12 > 0.000379 )
									ret := -0.764706 // sell
						if( Negative_Money_Flow > 3.88593e+06 )
							if( Typical_Price <= 0.065366 )
								if( Raw_Money_Flow <= 5.09602e+06 )
									ret := 0.937500 // buy
								if( Raw_Money_Flow > 5.09602e+06 )
									ret := -0.027027
							if( Typical_Price > 0.065366 )
								ret := 1.000000 // buy
				if( Raw_Money_Flow > 1.38684e+08 )
					if( Money_Flow_Ratio <= 5.48096 )
						ret := 1.000000 // buy
					if( Money_Flow_Ratio > 5.48096 )
						ret := 0.375000
	if( tema > 0.068161 )
		if( ema13 <= -0.001919 )
			if( tema <= 0.320499 )
				if( Positive_Money_Flow <= 148487 )
					if( Negative_Money_Flow <= 5.25862e+06 )
						if( MFI_High <= -45.2452 )
							if( Typical_Price <= 0.205411 )
								if( MFI_Low <= -15.6493 )
									ret := -1.000000 // sell
								if( MFI_Low > -15.6493 )
									ret := 0.087896
							if( Typical_Price > 0.205411 )
								if( Negative_Money_Flow_Sum <= 3.88268e+07 )
									ret := 0.476190
								if( Negative_Money_Flow_Sum > 3.88268e+07 )
									ret := -0.441860
						if( MFI_High > -45.2452 )
							if( MFI_High <= -43.4225 )
								if( tema <= 0.146723 )
									ret := 0.931818 // buy
								if( tema > 0.146723 )
									ret := 0.451613
							if( MFI_High > -43.4225 )
								if( ema3 <= 0.10734 )
									ret := 0.937500 // buy
								if( ema3 > 0.10734 )
									ret := 0.226415
					if( Negative_Money_Flow > 5.25862e+06 )
						if( Typical_Price <= 0.140895 )
							if( Raw_Money_Flow <= 1.30565e+07 )
								if( ema1 <= 0.113251 )
									ret := 0.190045
								if( ema1 > 0.113251 )
									ret := 0.505376
							if( Raw_Money_Flow > 1.30565e+07 )
								if( Positive_Money_Flow_Sum <= 7.27796e+06 )
									ret := 0.038462
								if( Positive_Money_Flow_Sum > 7.27796e+06 )
									ret := 0.647929
						if( Typical_Price > 0.140895 )
							if( ema2 <= 0.329775 )
								if( ema13 <= -0.002237 )
									ret := 0.255348
								if( ema13 > -0.002237 )
									ret := -0.037879
							if( ema2 > 0.329775 )
								if( ema13 <= -0.013976 )
									ret := 1.000000 // buy
								if( ema13 > -0.013976 )
									ret := 0.571429
				if( Positive_Money_Flow > 148487 )
					if( Positive_Money_Flow <= 4.70483e+07 )
						if( MFI <= 53.1602 )
							if( Negative_Money_Flow_Sum <= 9.47853e+07 )
								if( Negative_Money_Flow_Sum <= 7.70436e+07 )
									ret := 0.019945
								if( Negative_Money_Flow_Sum > 7.70436e+07 )
									ret := 0.401840
							if( Negative_Money_Flow_Sum > 9.47853e+07 )
								if( tema <= 0.173831 )
									ret := -0.247465
								if( tema > 0.173831 )
									ret := 0.008333
						if( MFI > 53.1602 )
							if( MFI <= 55.9696 )
								if( Typical_Price <= 0.147723 )
									ret := 0.333333
								if( Typical_Price > 0.147723 )
									ret := 1.000000 // buy
							if( MFI > 55.9696 )
								if( Positive_Money_Flow <= 7.36545e+06 )
									ret := 0.000000
								if( Positive_Money_Flow > 7.36545e+06 )
									ret := 0.661765
					if( Positive_Money_Flow > 4.70483e+07 )
						if( ema12 <= -0.002688 )
							if( MFI <= 40.1868 )
								if( ema13 <= -0.009996 )
									ret := 0.782051 // buy
								if( ema13 > -0.009996 )
									ret := 0.303030
							if( MFI > 40.1868 )
								if( ema2 <= 0.270068 )
									ret := 0.500000
								if( ema2 > 0.270068 )
									ret := -0.304348
						if( ema12 > -0.002688 )
							if( Positive_Money_Flow_Sum <= 6.727e+08 )
								if( MFI <= 45.867 )
									ret := -0.333333
								if( MFI > 45.867 )
									ret := -0.928571 // sell
							if( Positive_Money_Flow_Sum > 6.727e+08 )
								ret := 0.941176 // buy
			if( tema > 0.320499 )
				if( ema12 <= -0.003578 )
					if( Raw_Money_Flow <= 8.46918e+07 )
						if( ema2 <= 0.389363 )
							if( Negative_Money_Flow_Sum <= 4.85528e+08 )
								if( MFI_Low <= 28.4762 )
									ret := 0.119403
								if( MFI_Low > 28.4762 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.85528e+08 )
								if( Raw_Money_Flow <= 6.6125e+07 )
									ret := -0.847222 // sell
								if( Raw_Money_Flow > 6.6125e+07 )
									ret := 0.833333 // buy
						if( ema2 > 0.389363 )
							if( Positive_Money_Flow <= 5.64092e+07 )
								if( Raw_Money_Flow <= 3.51997e+07 )
									ret := -0.212766
								if( Raw_Money_Flow > 3.51997e+07 )
									ret := 0.527660
							if( Positive_Money_Flow > 5.64092e+07 )
								if( tema <= 0.454375 )
									ret := 0.166667
								if( tema > 0.454375 )
									ret := -0.846154 // sell
					if( Raw_Money_Flow > 8.46918e+07 )
						if( ema12 <= -0.011659 )
							if( Negative_Money_Flow_Sum <= 3.73253e+09 )
								if( Money_Flow_Ratio <= 0.369863 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.369863 )
									ret := 0.222222
							if( Negative_Money_Flow_Sum > 3.73253e+09 )
								ret := -1.000000 // sell
						if( ema12 > -0.011659 )
							if( Typical_Price <= 0.474127 )
								if( ema12 <= -0.005948 )
									ret := -0.869159 // sell
								if( ema12 > -0.005948 )
									ret := -0.034483
							if( Typical_Price > 0.474127 )
								if( Positive_Money_Flow <= 8.43011e+07 )
									ret := 0.333333
								if( Positive_Money_Flow > 8.43011e+07 )
									ret := -0.430233
				if( ema12 > -0.003578 )
					if( ema3 <= 0.380695 )
						if( Typical_Price <= 0.329326 )
							if( Negative_Money_Flow_Sum <= 8.96316e+07 )
								ret := 0.291667
							if( Negative_Money_Flow_Sum > 8.96316e+07 )
								if( ema3 <= 0.329581 )
									ret := -0.526316
								if( ema3 > 0.329581 )
									ret := -0.857143 // sell
						if( Typical_Price > 0.329326 )
							if( ema3 <= 0.353014 )
								if( Positive_Money_Flow_Sum <= 6.54723e+07 )
									ret := -0.352941
								if( Positive_Money_Flow_Sum > 6.54723e+07 )
									ret := 0.468750
							if( ema3 > 0.353014 )
								if( MFI_High <= -30.6881 )
									ret := -0.459770
								if( MFI_High > -30.6881 )
									ret := 0.750000 // buy
					if( ema3 > 0.380695 )
						if( Negative_Money_Flow_Sum <= 1.92662e+09 )
							if( ema2 <= 0.501814 )
								if( Negative_Money_Flow <= 308926 )
									ret := -0.239130
								if( Negative_Money_Flow > 308926 )
									ret := -0.647059
							if( ema2 > 0.501814 )
								if( Positive_Money_Flow <= 7.72872e+07 )
									ret := -0.986667 // sell
								if( Positive_Money_Flow > 7.72872e+07 )
									ret := -0.625000
						if( Negative_Money_Flow_Sum > 1.92662e+09 )
							ret := 1.000000 // buy
		if( ema13 > -0.001919 )
			if( ema2 <= 0.662517 )
				if( MFI_Low <= 60.7218 )
					if( ema12 <= -0.001459 )
						if( tema <= 0.436331 )
							if( ema13 <= -0.000487 )
								if( Negative_Money_Flow <= 3.3542e+07 )
									ret := 0.467290
								if( Negative_Money_Flow > 3.3542e+07 )
									ret := -0.238095
							if( ema13 > -0.000487 )
								if( Negative_Money_Flow_Sum <= 8.69019e+08 )
									ret := 0.900000 // buy
								if( Negative_Money_Flow_Sum > 8.69019e+08 )
									ret := 0.333333
						if( tema > 0.436331 )
							ret := -0.636364
					if( ema12 > -0.001459 )
						if( ema12 <= 0.002248 )
							if( Positive_Money_Flow <= 3.66144e+06 )
								if( ema13 <= 0.002058 )
									ret := -0.018100
								if( ema13 > 0.002058 )
									ret := 0.145489
							if( Positive_Money_Flow > 3.66144e+06 )
								if( Money_Flow_Ratio <= 1.2949 )
									ret := -0.215909
								if( Money_Flow_Ratio > 1.2949 )
									ret := -0.006947
						if( ema12 > 0.002248 )
							if( tema <= 0.148026 )
								if( Positive_Money_Flow <= 1.32151e+07 )
									ret := -0.122066
								if( Positive_Money_Flow > 1.32151e+07 )
									ret := 0.416290
							if( tema > 0.148026 )
								if( Positive_Money_Flow_Sum <= 3.86549e+08 )
									ret := -0.268072
								if( Positive_Money_Flow_Sum > 3.86549e+08 )
									ret := -0.042897
				if( MFI_Low > 60.7218 )
					if( ema13 <= 0.001941 )
						if( ema3 <= 0.076502 )
							if( ema12 <= 0.000915 )
								if( ema2 <= 0.076237 )
									ret := -0.078189
								if( ema2 > 0.076237 )
									ret := -0.875000 // sell
							if( ema12 > 0.000915 )
								if( MFI_Low <= 69.7839 )
									ret := -0.909091 // sell
								if( MFI_Low > 69.7839 )
									ret := -0.090909
						if( ema3 > 0.076502 )
							if( Positive_Money_Flow <= 2.18147e+07 )
								if( MFI <= 80.7673 )
									ret := -0.833333 // sell
								if( MFI > 80.7673 )
									ret := 0.105099
							if( Positive_Money_Flow > 2.18147e+07 )
								if( Raw_Money_Flow <= 2.43026e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 2.43026e+07 )
									ret := -0.115385
					if( ema13 > 0.001941 )
						if( Negative_Money_Flow_Sum <= 4.76729e+07 )
							if( ema2 <= 0.256416 )
								if( Positive_Money_Flow <= 1.2123e+06 )
									ret := 0.187500
								if( Positive_Money_Flow > 1.2123e+06 )
									ret := -0.374582
							if( ema2 > 0.256416 )
								if( ema3 <= 0.259499 )
									ret := -0.785714 // sell
								if( ema3 > 0.259499 )
									ret := -0.963855 // sell
						if( Negative_Money_Flow_Sum > 4.76729e+07 )
							if( ema12 <= 0.005786 )
								if( MFI <= 85.73 )
									ret := 0.518519
								if( MFI > 85.73 )
									ret := -0.320000
							if( ema12 > 0.005786 )
								if( ema2 <= 0.139923 )
									ret := 0.388889
								if( ema2 > 0.139923 )
									ret := -0.450867
			if( ema2 > 0.662517 )
				if( tema <= 0.703125 )
					ret := 1.000000 // buy
				if( tema > 0.703125 )
					ret := -0.300000
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_81a998ff(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


