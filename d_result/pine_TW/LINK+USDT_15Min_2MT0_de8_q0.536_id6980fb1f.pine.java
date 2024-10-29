//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: LINKUSDT_15Min_2MT0_6980fb1f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2MT0_6980fb1f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_6980fb1f(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.021261 )
		if( Negative_Money_Flow <= 439642 )
			if( Negative_Money_Flow_Sum <= 2.82639e+06 )
				if( ema3 <= 7.93566 )
					if( Positive_Money_Flow <= 270594 )
						if( ema13 <= -0.029383 )
							if( Negative_Money_Flow_Sum <= 2.62581e+06 )
								if( Raw_Money_Flow <= 420168 )
									ret := 0.191304
								if( Raw_Money_Flow > 420168 )
									ret := -0.444444
							if( Negative_Money_Flow_Sum > 2.62581e+06 )
								if( ema2 <= 7.72734 )
									ret := -0.119048
								if( ema2 > 7.72734 )
									ret := 0.636364
						if( ema13 > -0.029383 )
							if( Negative_Money_Flow_Sum <= 2.40827e+06 )
								if( ema1 <= 6.91202 )
									ret := 0.000000
								if( ema1 > 6.91202 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 2.40827e+06 )
								ret := 0.285714
					if( Positive_Money_Flow > 270594 )
						if( Positive_Money_Flow <= 702199 )
							if( Money_Flow_Ratio <= 1.12282 )
								if( Typical_Price <= 7.15329 )
									ret := -0.518072
								if( Typical_Price > 7.15329 )
									ret := -0.076923
							if( Money_Flow_Ratio > 1.12282 )
								if( ema13 <= -0.054609 )
									ret := 0.000000
								if( ema13 > -0.054609 )
									ret := 0.555556
						if( Positive_Money_Flow > 702199 )
							if( ema3 <= 6.69678 )
								ret := 0.600000
							if( ema3 > 6.69678 )
								ret := 1.000000 // buy
				if( ema3 > 7.93566 )
					if( MFI_Low <= 3.68474 )
						if( ema13 <= -0.07166 )
							if( Negative_Money_Flow_Sum <= 2.47665e+06 )
								if( Typical_Price <= 10.0567 )
									ret := 0.913043 // buy
								if( Typical_Price > 10.0567 )
									ret := 0.323529
							if( Negative_Money_Flow_Sum > 2.47665e+06 )
								if( Raw_Money_Flow <= 409406 )
									ret := 0.152174
								if( Raw_Money_Flow > 409406 )
									ret := -1.000000 // sell
						if( ema13 > -0.07166 )
							if( Negative_Money_Flow <= 259039 )
								if( ema12 <= -0.034862 )
									ret := -0.245902
								if( ema12 > -0.034862 )
									ret := 0.184932
							if( Negative_Money_Flow > 259039 )
								if( Positive_Money_Flow_Sum <= 614881 )
									ret := -0.156863
								if( Positive_Money_Flow_Sum > 614881 )
									ret := -0.933333 // sell
					if( MFI_Low > 3.68474 )
						if( Negative_Money_Flow <= 169068 )
							if( ema12 <= -0.043373 )
								if( ema3 <= 9.96803 )
									ret := -1.000000 // sell
								if( ema3 > 9.96803 )
									ret := -0.243243
							if( ema12 > -0.043373 )
								if( Raw_Money_Flow <= 214967 )
									ret := -0.079659
								if( Raw_Money_Flow > 214967 )
									ret := 0.097403
						if( Negative_Money_Flow > 169068 )
							if( Negative_Money_Flow_Sum <= 2.78306e+06 )
								if( Positive_Money_Flow_Sum <= 974501 )
									ret := -0.445415
								if( Positive_Money_Flow_Sum > 974501 )
									ret := -0.150588
							if( Negative_Money_Flow_Sum > 2.78306e+06 )
								if( ema13 <= -0.055072 )
									ret := -0.083333
								if( ema13 > -0.055072 )
									ret := 0.714286 // buy
			if( Negative_Money_Flow_Sum > 2.82639e+06 )
				if( MFI_Low <= 6.31999 )
					if( Positive_Money_Flow_Sum <= 7.31742e+06 )
						if( ema12 <= -0.098365 )
							if( MFI_Low <= 3.92315 )
								if( ema3 <= 11.3422 )
									ret := 0.000000
								if( ema3 > 11.3422 )
									ret := -0.394928
							if( MFI_Low > 3.92315 )
								if( ema3 <= 15.171 )
									ret := -0.205128
								if( ema3 > 15.171 )
									ret := 0.678571
						if( ema12 > -0.098365 )
							if( MFI_Low <= 4.91752 )
								if( Negative_Money_Flow_Sum <= 4.07344e+06 )
									ret := -0.005714
								if( Negative_Money_Flow_Sum > 4.07344e+06 )
									ret := 0.127583
							if( MFI_Low > 4.91752 )
								if( ema12 <= -0.082902 )
									ret := 0.608696
								if( ema12 > -0.082902 )
									ret := -0.150000
					if( Positive_Money_Flow_Sum > 7.31742e+06 )
						if( tema <= 17.5063 )
							if( MFI_Low <= 0.541263 )
								if( Money_Flow_Ratio <= 0.234089 )
									ret := 0.833333 // buy
								if( Money_Flow_Ratio > 0.234089 )
									ret := -1.000000 // sell
							if( MFI_Low > 0.541263 )
								if( tema <= 15.4464 )
									ret := 0.909091 // buy
								if( tema > 15.4464 )
									ret := 0.428571
						if( tema > 17.5063 )
							if( ema12 <= -0.168327 )
								ret := 0.714286 // buy
							if( ema12 > -0.168327 )
								if( Raw_Money_Flow <= 1.73042e+06 )
									ret := 0.166667
								if( Raw_Money_Flow > 1.73042e+06 )
									ret := -0.833333 // sell
				if( MFI_Low > 6.31999 )
					if( Positive_Money_Flow_Sum <= 7.36556e+06 )
						if( Positive_Money_Flow_Sum <= 2.10208e+06 )
							if( Positive_Money_Flow <= 275047 )
								if( ema12 <= -0.052772 )
									ret := -0.021053
								if( ema12 > -0.052772 )
									ret := 0.331442
							if( Positive_Money_Flow > 275047 )
								if( MFI_High <= -51.753 )
									ret := 0.393939
								if( MFI_High > -51.753 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 2.10208e+06 )
							if( ema12 <= -0.058194 )
								if( MFI_High <= -35.248 )
									ret := 0.193957
								if( MFI_High > -35.248 )
									ret := 0.658228
							if( ema12 > -0.058194 )
								if( Money_Flow_Ratio <= 0.686404 )
									ret := 0.035506
								if( Money_Flow_Ratio > 0.686404 )
									ret := 0.148860
					if( Positive_Money_Flow_Sum > 7.36556e+06 )
						if( ema13 <= -0.127536 )
							if( MFI <= 44.1181 )
								if( MFI <= 36.1493 )
									ret := 0.208333
								if( MFI > 36.1493 )
									ret := -0.119122
							if( MFI > 44.1181 )
								if( MFI <= 47.246 )
									ret := 0.623188
								if( MFI > 47.246 )
									ret := 0.156627
						if( ema13 > -0.127536 )
							if( MFI_High <= -22.189 )
								if( Money_Flow_Ratio <= 0.445646 )
									ret := 0.608696
								if( Money_Flow_Ratio > 0.445646 )
									ret := -0.187902
							if( MFI_High > -22.189 )
								if( Negative_Money_Flow_Sum <= 1.00864e+07 )
									ret := 0.136364
								if( Negative_Money_Flow_Sum > 1.00864e+07 )
									ret := 0.800000 // buy
		if( Negative_Money_Flow > 439642 )
			if( Positive_Money_Flow_Sum <= 500475 )
				if( Raw_Money_Flow <= 2.27365e+06 )
					if( Raw_Money_Flow <= 863047 )
						if( Positive_Money_Flow_Sum <= 253630 )
							if( ema13 <= -0.097149 )
								if( MFI_Low <= -17.5615 )
									ret := 0.000000
								if( MFI_Low > -17.5615 )
									ret := -0.846154 // sell
							if( ema13 > -0.097149 )
								if( MFI <= 4.00772 )
									ret := 0.000000
								if( MFI > 4.00772 )
									ret := 0.428571
						if( Positive_Money_Flow_Sum > 253630 )
							if( ema13 <= -0.115696 )
								if( ema12 <= -0.102814 )
									ret := -0.235294
								if( ema12 > -0.102814 )
									ret := 0.687500
							if( ema13 > -0.115696 )
								if( ema12 <= -0.067003 )
									ret := -0.777778 // sell
								if( ema12 > -0.067003 )
									ret := 0.030769
					if( Raw_Money_Flow > 863047 )
						if( Negative_Money_Flow_Sum <= 1.19159e+07 )
							if( ema13 <= -0.170265 )
								if( Positive_Money_Flow_Sum <= 326663 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 326663 )
									ret := 0.583333
							if( ema13 > -0.170265 )
								if( ema3 <= 6.48187 )
									ret := 0.142857
								if( ema3 > 6.48187 )
									ret := -0.753247 // sell
						if( Negative_Money_Flow_Sum > 1.19159e+07 )
							ret := 1.000000 // buy
				if( Raw_Money_Flow > 2.27365e+06 )
					if( MFI_High <= -76.0958 )
						if( Raw_Money_Flow <= 3.52028e+06 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 3.52028e+06 )
							ret := 0.500000
					if( MFI_High > -76.0958 )
						if( Negative_Money_Flow <= 3.02868e+06 )
							ret := 0.500000
						if( Negative_Money_Flow > 3.02868e+06 )
							ret := -0.250000
			if( Positive_Money_Flow_Sum > 500475 )
				if( Raw_Money_Flow <= 597497 )
					if( ema12 <= -0.108793 )
						if( Typical_Price <= 7.39387 )
							if( MFI <= 20.9005 )
								ret := 0.000000
							if( MFI > 20.9005 )
								if( Raw_Money_Flow <= 577302 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 577302 )
									ret := -0.750000 // sell
						if( Typical_Price > 7.39387 )
							if( Negative_Money_Flow <= 514082 )
								if( Positive_Money_Flow_Sum <= 1.88031e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.88031e+06 )
									ret := 0.857143 // buy
							if( Negative_Money_Flow > 514082 )
								if( tema <= 14.0226 )
									ret := -0.588235
								if( tema > 14.0226 )
									ret := 0.250000
					if( ema12 > -0.108793 )
						if( tema <= 16.2193 )
							if( MFI_Low <= -3.60288 )
								if( tema <= 6.41541 )
									ret := 0.000000
								if( tema > 6.41541 )
									ret := 0.641975
							if( MFI_Low > -3.60288 )
								if( MFI_High <= -55.5304 )
									ret := 0.166205
								if( MFI_High > -55.5304 )
									ret := 0.372605
						if( tema > 16.2193 )
							if( Negative_Money_Flow <= 523897 )
								if( ema3 <= 18.0783 )
									ret := -0.361111
								if( ema3 > 18.0783 )
									ret := 0.038462
							if( Negative_Money_Flow > 523897 )
								if( MFI_Low <= 14.7422 )
									ret := 0.390244
								if( MFI_Low > 14.7422 )
									ret := 0.000000
				if( Raw_Money_Flow > 597497 )
					if( Negative_Money_Flow_Sum <= 1.99207e+07 )
						if( Positive_Money_Flow_Sum <= 1.47676e+07 )
							if( ema13 <= -0.269652 )
								if( Typical_Price <= 12.7872 )
									ret := -0.504587
								if( Typical_Price > 12.7872 )
									ret := 0.302632
							if( ema13 > -0.269652 )
								if( Positive_Money_Flow_Sum <= 7.63368e+06 )
									ret := 0.180031
								if( Positive_Money_Flow_Sum > 7.63368e+06 )
									ret := 0.001008
						if( Positive_Money_Flow_Sum > 1.47676e+07 )
							if( Negative_Money_Flow <= 1.58231e+06 )
								if( ema12 <= -0.036772 )
									ret := 0.871795 // buy
								if( ema12 > -0.036772 )
									ret := 0.529412
							if( Negative_Money_Flow > 1.58231e+06 )
								if( MFI <= 50.4667 )
									ret := -0.428571
								if( MFI > 50.4667 )
									ret := 0.586207
					if( Negative_Money_Flow_Sum > 1.99207e+07 )
						if( ema13 <= -0.183206 )
							if( Negative_Money_Flow <= 1.31527e+06 )
								if( Negative_Money_Flow_Sum <= 3.68884e+07 )
									ret := 0.253623
								if( Negative_Money_Flow_Sum > 3.68884e+07 )
									ret := -0.560000
							if( Negative_Money_Flow > 1.31527e+06 )
								if( Negative_Money_Flow_Sum <= 2.71147e+07 )
									ret := 0.754545 // buy
								if( Negative_Money_Flow_Sum > 2.71147e+07 )
									ret := 0.354167
						if( ema13 > -0.183206 )
							if( Negative_Money_Flow_Sum <= 2.27953e+07 )
								if( ema3 <= 11.3442 )
									ret := -0.545455
								if( ema3 > 11.3442 )
									ret := 0.494737
							if( Negative_Money_Flow_Sum > 2.27953e+07 )
								if( Money_Flow_Ratio <= 0.659981 )
									ret := 0.017241
								if( Money_Flow_Ratio > 0.659981 )
									ret := -0.655172
	if( ema12 > -0.021261 )
		if( Negative_Money_Flow <= 123655 )
			if( ema13 <= 0.268398 )
				if( Positive_Money_Flow_Sum <= 1.37055e+07 )
					if( ema12 <= 0.099553 )
						if( Negative_Money_Flow_Sum <= 1.10852e+07 )
							if( ema3 <= 7.14963 )
								if( Positive_Money_Flow_Sum <= 9.61041e+06 )
									ret := 0.030253
								if( Positive_Money_Flow_Sum > 9.61041e+06 )
									ret := -0.266010
							if( ema3 > 7.14963 )
								if( ema1 <= 19.0436 )
									ret := -0.007045
								if( ema1 > 19.0436 )
									ret := -0.134487
						if( Negative_Money_Flow_Sum > 1.10852e+07 )
							if( MFI <= 38.7587 )
								if( Negative_Money_Flow_Sum <= 1.19039e+07 )
									ret := 0.821429 // buy
								if( Negative_Money_Flow_Sum > 1.19039e+07 )
									ret := 0.323529
							if( MFI > 38.7587 )
								if( ema3 <= 14.6537 )
									ret := 0.263158
								if( ema3 > 14.6537 )
									ret := -0.240310
					if( ema12 > 0.099553 )
						if( Positive_Money_Flow <= 1.25101e+06 )
							if( ema12 <= 0.101297 )
								if( ema1 <= 16.9769 )
									ret := 0.750000 // buy
								if( ema1 > 16.9769 )
									ret := 0.000000
							if( ema12 > 0.101297 )
								if( ema1 <= 7.27362 )
									ret := 0.560000
								if( ema1 > 7.27362 )
									ret := -0.015209
						if( Positive_Money_Flow > 1.25101e+06 )
							if( MFI <= 87.7434 )
								if( MFI_Low <= 51.8141 )
									ret := 0.031250
								if( MFI_Low > 51.8141 )
									ret := 0.564246
							if( MFI > 87.7434 )
								if( ema13 <= 0.229529 )
									ret := -0.545455
								if( ema13 > 0.229529 )
									ret := 0.166667
				if( Positive_Money_Flow_Sum > 1.37055e+07 )
					if( ema12 <= 0.113913 )
						if( ema3 <= 14.5673 )
							if( Negative_Money_Flow_Sum <= 2.78099e+06 )
								if( Negative_Money_Flow_Sum <= 1.88841e+06 )
									ret := -0.606061
								if( Negative_Money_Flow_Sum > 1.88841e+06 )
									ret := 0.444444
							if( Negative_Money_Flow_Sum > 2.78099e+06 )
								if( MFI_Low <= 50.2494 )
									ret := -0.299065
								if( MFI_Low > 50.2494 )
									ret := -0.565543
						if( ema3 > 14.5673 )
							if( Negative_Money_Flow_Sum <= 9.49375e+06 )
								if( Raw_Money_Flow <= 2.30979e+06 )
									ret := -0.418530
								if( Raw_Money_Flow > 2.30979e+06 )
									ret := 0.010989
							if( Negative_Money_Flow_Sum > 9.49375e+06 )
								if( Positive_Money_Flow_Sum <= 1.48863e+07 )
									ret := -0.634146
								if( Positive_Money_Flow_Sum > 1.48863e+07 )
									ret := 0.206642
					if( ema12 > 0.113913 )
						if( MFI <= 92.8516 )
							if( Raw_Money_Flow <= 3.63442e+06 )
								if( MFI_High <= -2.61876 )
									ret := 0.094340
								if( MFI_High > -2.61876 )
									ret := -0.396104
							if( Raw_Money_Flow > 3.63442e+06 )
								if( ema3 <= 9.33116 )
									ret := 0.821429 // buy
								if( ema3 > 9.33116 )
									ret := 0.250000
						if( MFI > 92.8516 )
							if( ema13 <= 0.229601 )
								if( Negative_Money_Flow_Sum <= 588943 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 588943 )
									ret := 0.272727
							if( ema13 > 0.229601 )
								if( Raw_Money_Flow <= 5.60180e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 5.60180e+06 )
									ret := 0.500000
			if( ema13 > 0.268398 )
				if( ema13 <= 0.459011 )
					if( Raw_Money_Flow <= 1.12976e+07 )
						if( Positive_Money_Flow <= 4.67332e+06 )
							if( Positive_Money_Flow_Sum <= 5.17504e+07 )
								if( ema1 <= 6.83297 )
									ret := -1.000000 // sell
								if( ema1 > 6.83297 )
									ret := 0.265550
							if( Positive_Money_Flow_Sum > 5.17504e+07 )
								if( ema12 <= 0.190624 )
									ret := -1.000000 // sell
								if( ema12 > 0.190624 )
									ret := -0.333333
						if( Positive_Money_Flow > 4.67332e+06 )
							if( Negative_Money_Flow_Sum <= 1.29934e+07 )
								if( ema2 <= 9.50231 )
									ret := 0.166667
								if( ema2 > 9.50231 )
									ret := 0.833333 // buy
							if( Negative_Money_Flow_Sum > 1.29934e+07 )
								if( MFI_Low <= 59.0565 )
									ret := 0.176471
								if( MFI_Low > 59.0565 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 1.12976e+07 )
						if( tema <= 17.3911 )
							ret := -0.750000 // sell
						if( tema > 17.3911 )
							ret := -1.000000 // sell
				if( ema13 > 0.459011 )
					if( ema12 <= 0.236448 )
						ret := 0.833333 // buy
					if( ema12 > 0.236448 )
						if( Positive_Money_Flow_Sum <= 3.71696e+07 )
							if( Raw_Money_Flow <= 4.26174e+06 )
								if( tema <= 14.2694 )
									ret := -0.400000
								if( tema > 14.2694 )
									ret := 0.600000
							if( Raw_Money_Flow > 4.26174e+06 )
								if( Typical_Price <= 14.8042 )
									ret := 1.000000 // buy
								if( Typical_Price > 14.8042 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 3.71696e+07 )
							if( Raw_Money_Flow <= 7.45698e+06 )
								if( Positive_Money_Flow <= 4.6221e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 4.6221e+06 )
									ret := -0.863636 // sell
							if( Raw_Money_Flow > 7.45698e+06 )
								if( Positive_Money_Flow <= 1.06825e+07 )
									ret := 0.500000
								if( Positive_Money_Flow > 1.06825e+07 )
									ret := -0.700000 // sell
		if( Negative_Money_Flow > 123655 )
			if( ema2 <= 20.0969 )
				if( ema13 <= 0.306496 )
					if( Positive_Money_Flow_Sum <= 9.57586e+06 )
						if( Negative_Money_Flow_Sum <= 3.25979e+06 )
							if( Typical_Price <= 12.6764 )
								if( Positive_Money_Flow_Sum <= 1.63306e+06 )
									ret := 0.035632
								if( Positive_Money_Flow_Sum > 1.63306e+06 )
									ret := 0.103695
							if( Typical_Price > 12.6764 )
								if( ema12 <= 0.101011 )
									ret := -0.027962
								if( ema12 > 0.101011 )
									ret := 0.562500
						if( Negative_Money_Flow_Sum > 3.25979e+06 )
							if( Raw_Money_Flow <= 5.75848e+06 )
								if( Negative_Money_Flow_Sum <= 1.16337e+07 )
									ret := 0.123497
								if( Negative_Money_Flow_Sum > 1.16337e+07 )
									ret := 0.382353
							if( Raw_Money_Flow > 5.75848e+06 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 9.57586e+06 )
						if( Negative_Money_Flow_Sum <= 2.7287e+06 )
							if( Negative_Money_Flow_Sum <= 2.13161e+06 )
								if( Raw_Money_Flow <= 323499 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 323499 )
									ret := 0.218750
							if( Negative_Money_Flow_Sum > 2.13161e+06 )
								if( Negative_Money_Flow_Sum <= 2.35501e+06 )
									ret := 0.830189 // buy
								if( Negative_Money_Flow_Sum > 2.35501e+06 )
									ret := 0.413333
						if( Negative_Money_Flow_Sum > 2.7287e+06 )
							if( Negative_Money_Flow_Sum <= 9.61764e+06 )
								if( MFI_High <= -24.9927 )
									ret := -0.510000
								if( MFI_High > -24.9927 )
									ret := -0.091317
							if( Negative_Money_Flow_Sum > 9.61764e+06 )
								if( Positive_Money_Flow_Sum <= 3.15616e+07 )
									ret := 0.054103
								if( Positive_Money_Flow_Sum > 3.15616e+07 )
									ret := -0.445545
				if( ema13 > 0.306496 )
					if( Money_Flow_Ratio <= 3.53989 )
						if( ema1 <= 7.51788 )
							ret := 1.000000 // buy
						if( ema1 > 7.51788 )
							if( Negative_Money_Flow_Sum <= 8.66589e+06 )
								if( Negative_Money_Flow_Sum <= 7.05433e+06 )
									ret := -0.120000
								if( Negative_Money_Flow_Sum > 7.05433e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 8.66589e+06 )
								if( Negative_Money_Flow_Sum <= 2.68217e+07 )
									ret := 0.139535
								if( Negative_Money_Flow_Sum > 2.68217e+07 )
									ret := 0.866667 // buy
					if( Money_Flow_Ratio > 3.53989 )
						if( Positive_Money_Flow <= 1.7684e+06 )
							if( Raw_Money_Flow <= 1.60228e+06 )
								if( Negative_Money_Flow_Sum <= 3.90482e+06 )
									ret := 0.727273 // buy
								if( Negative_Money_Flow_Sum > 3.90482e+06 )
									ret := -0.272727
							if( Raw_Money_Flow > 1.60228e+06 )
								if( Positive_Money_Flow_Sum <= 4.45695e+07 )
									ret := 0.917647 // buy
								if( Positive_Money_Flow_Sum > 4.45695e+07 )
									ret := 0.363636
						if( Positive_Money_Flow > 1.7684e+06 )
							if( Negative_Money_Flow <= 1.01835e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.01835e+06 )
								ret := 0.500000
			if( ema2 > 20.0969 )
				if( Negative_Money_Flow <= 992303 )
					if( ema2 <= 20.1566 )
						if( Negative_Money_Flow <= 510023 )
							ret := -0.142857
						if( Negative_Money_Flow > 510023 )
							if( Negative_Money_Flow_Sum <= 5.24738e+06 )
								if( ema13 <= 0.051321 )
									ret := 0.000000
								if( ema13 > 0.051321 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 5.24738e+06 )
								if( MFI_High <= -41.0469 )
									ret := -0.750000 // sell
								if( MFI_High > -41.0469 )
									ret := -1.000000 // sell
					if( ema2 > 20.1566 )
						if( Negative_Money_Flow_Sum <= 1.17264e+07 )
							if( ema12 <= 0.055255 )
								if( Negative_Money_Flow_Sum <= 6.53548e+06 )
									ret := 0.056604
								if( Negative_Money_Flow_Sum > 6.53548e+06 )
									ret := -0.320000
							if( ema12 > 0.055255 )
								if( ema12 <= 0.059395 )
									ret := 1.000000 // buy
								if( ema12 > 0.059395 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 1.17264e+07 )
							ret := 0.857143 // buy
				if( Negative_Money_Flow > 992303 )
					if( Money_Flow_Ratio <= 0.54026 )
						ret := 1.000000 // buy
					if( Money_Flow_Ratio > 0.54026 )
						if( Positive_Money_Flow_Sum <= 1.4878e+07 )
							if( Positive_Money_Flow_Sum <= 7.47772e+06 )
								if( Typical_Price <= 20.456 )
									ret := 0.000000
								if( Typical_Price > 20.456 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 7.47772e+06 )
								if( Money_Flow_Ratio <= 1.3673 )
									ret := -0.655172
								if( Money_Flow_Ratio > 1.3673 )
									ret := -0.400000
						if( Positive_Money_Flow_Sum > 1.4878e+07 )
							if( ema13 <= 0.194522 )
								if( Negative_Money_Flow <= 1.44589e+06 )
									ret := -0.357143
								if( Negative_Money_Flow > 1.44589e+06 )
									ret := 0.222222
							if( ema13 > 0.194522 )
								if( tema <= 20.7353 )
									ret := 0.000000
								if( tema > 20.7353 )
									ret := -0.650000
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_6980fb1f(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


