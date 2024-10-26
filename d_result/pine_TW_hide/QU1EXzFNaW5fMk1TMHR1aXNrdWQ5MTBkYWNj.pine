//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AMD_1Min_2MS0_d910dacc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_1Min_2MS0_d910dacc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_1Min_d910dacc(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 36.2846 )
		if( Positive_Money_Flow <= 3.17882e+07 )
			if( MFI <= 12.6951 )
				if( Negative_Money_Flow_Sum <= 4.55375e+07 )
					if( rsi1 <= 26.7919 )
						if( Raw_Money_Flow <= 557635 )
							if( Typical_Price <= 136.955 )
								if( k <= 2.82504 )
									ret := 0.600000
								if( k > 2.82504 )
									ret := -0.700000 // sell
							if( Typical_Price > 136.955 )
								if( Typical_Price <= 154.543 )
									ret := 0.438202
								if( Typical_Price > 154.543 )
									ret := 0.182927
						if( Raw_Money_Flow > 557635 )
							if( k <= 0.009991 )
								if( rsi1 <= 8.44565 )
									ret := 0.857143 // buy
								if( rsi1 > 8.44565 )
									ret := 0.111111
							if( k > 0.009991 )
								if( Raw_Money_Flow <= 7.05677e+06 )
									ret := 0.732283 // buy
								if( Raw_Money_Flow > 7.05677e+06 )
									ret := 0.277778
					if( rsi1 > 26.7919 )
						if( MFI_High <= -71.0619 )
							if( d <= 19.8999 )
								if( Typical_Price <= 150.152 )
									ret := 0.476190
								if( Typical_Price > 150.152 )
									ret := -0.093750
							if( d > 19.8999 )
								if( Positive_Money_Flow_Sum <= 248867 )
									ret := 0.083333
								if( Positive_Money_Flow_Sum > 248867 )
									ret := 0.630769
						if( MFI_High > -71.0619 )
							if( Typical_Price <= 126.955 )
								ret := 1.000000 // buy
							if( Typical_Price > 126.955 )
								if( smoothK_k <= 52.5608 )
									ret := -0.104396
								if( smoothK_k > 52.5608 )
									ret := 0.391304
				if( Negative_Money_Flow_Sum > 4.55375e+07 )
					if( Raw_Money_Flow <= 2.61878e+07 )
						if( Negative_Money_Flow_Sum <= 2.07641e+08 )
							if( Negative_Money_Flow_Sum <= 1.86304e+08 )
								if( Typical_Price <= 149.545 )
									ret := 0.456897
								if( Typical_Price > 149.545 )
									ret := -0.189873
							if( Negative_Money_Flow_Sum > 1.86304e+08 )
								if( d <= 0.046874 )
									ret := 0.000000
								if( d > 0.046874 )
									ret := -0.787234 // sell
						if( Negative_Money_Flow_Sum > 2.07641e+08 )
							if( Negative_Money_Flow_Sum <= 2.1218e+08 )
								if( Raw_Money_Flow <= 1.17573e+07 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.17573e+07 )
									ret := 0.842105 // buy
							if( Negative_Money_Flow_Sum > 2.1218e+08 )
								if( rsi1 <= 28.2451 )
									ret := 0.251366
								if( rsi1 > 28.2451 )
									ret := -0.097826
					if( Raw_Money_Flow > 2.61878e+07 )
						if( rsi1 <= 10.7072 )
							if( Typical_Price <= 162.304 )
								if( smoothD_d <= -0.392218 )
									ret := -0.518519
								if( smoothD_d > -0.392218 )
									ret := 0.135135
							if( Typical_Price > 162.304 )
								if( Positive_Money_Flow_Sum <= 3.89193e+07 )
									ret := 0.640000
								if( Positive_Money_Flow_Sum > 3.89193e+07 )
									ret := -0.545455
						if( rsi1 > 10.7072 )
							if( Positive_Money_Flow_Sum <= 4.58113e+07 )
								if( k <= 30.7629 )
									ret := 0.374359
								if( k > 30.7629 )
									ret := -0.277778
							if( Positive_Money_Flow_Sum > 4.58113e+07 )
								if( Negative_Money_Flow <= 9.30369e+07 )
									ret := 0.861111 // buy
								if( Negative_Money_Flow > 9.30369e+07 )
									ret := -0.076923
			if( MFI > 12.6951 )
				if( Typical_Price <= 160 )
					if( d <= 25.4542 )
						if( Typical_Price <= 125.129 )
							if( rsi1 <= 20.0565 )
								ret := -1.000000 // sell
							if( rsi1 > 20.0565 )
								ret := 0.142857
						if( Typical_Price > 125.129 )
							if( Typical_Price <= 151.876 )
								if( Positive_Money_Flow_Sum <= 8.89174e+07 )
									ret := 0.138994
								if( Positive_Money_Flow_Sum > 8.89174e+07 )
									ret := 0.003896
							if( Typical_Price > 151.876 )
								if( Negative_Money_Flow <= 6.36199e+07 )
									ret := 0.026384
								if( Negative_Money_Flow > 6.36199e+07 )
									ret := 0.925926 // buy
					if( d > 25.4542 )
						if( smoothK_k <= 59.4444 )
							if( Negative_Money_Flow <= 1.34535e+06 )
								if( rsi1 <= 30.4829 )
									ret := 0.260174
								if( rsi1 > 30.4829 )
									ret := 0.074979
							if( Negative_Money_Flow > 1.34535e+06 )
								if( Negative_Money_Flow_Sum <= 1.33216e+07 )
									ret := 0.606250
								if( Negative_Money_Flow_Sum > 1.33216e+07 )
									ret := 0.240825
						if( smoothK_k > 59.4444 )
							if( Typical_Price <= 155.947 )
								if( MFI_Low <= 4.64677 )
									ret := -0.200000
								if( MFI_Low > 4.64677 )
									ret := 0.074394
							if( Typical_Price > 155.947 )
								if( MFI_High <= -48.2841 )
									ret := 0.541667
								if( MFI_High > -48.2841 )
									ret := 0.022989
				if( Typical_Price > 160 )
					if( Positive_Money_Flow <= 2.41379e+07 )
						if( Positive_Money_Flow_Sum <= 3.15557e+08 )
							if( Raw_Money_Flow <= 8.34564e+07 )
								if( rsi1 <= 24.3016 )
									ret := -0.088339
								if( rsi1 > 24.3016 )
									ret := 0.030645
							if( Raw_Money_Flow > 8.34564e+07 )
								if( Negative_Money_Flow <= 1.00447e+08 )
									ret := 0.634615
								if( Negative_Money_Flow > 1.00447e+08 )
									ret := 0.045455
						if( Positive_Money_Flow_Sum > 3.15557e+08 )
							if( Negative_Money_Flow <= 5.72865e+07 )
								if( d_k <= -0.845925 )
									ret := 0.235294
								if( d_k > -0.845925 )
									ret := -0.466667
							if( Negative_Money_Flow > 5.72865e+07 )
								if( Typical_Price <= 171.548 )
									ret := -1.000000 // sell
								if( Typical_Price > 171.548 )
									ret := -0.714286 // sell
					if( Positive_Money_Flow > 2.41379e+07 )
						if( Positive_Money_Flow <= 2.74622e+07 )
							if( Negative_Money_Flow_Sum <= 1.71629e+08 )
								if( Negative_Money_Flow_Sum <= 1.59761e+08 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 1.59761e+08 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.71629e+08 )
								if( rsi1 <= 21.542 )
									ret := 0.333333
								if( rsi1 > 21.542 )
									ret := 0.854545 // buy
						if( Positive_Money_Flow > 2.74622e+07 )
							if( Negative_Money_Flow_Sum <= 3.88127e+08 )
								if( rsi1 <= 29.2872 )
									ret := -0.642857
								if( rsi1 > 29.2872 )
									ret := 0.225000
							if( Negative_Money_Flow_Sum > 3.88127e+08 )
								if( Negative_Money_Flow_Sum <= 4.99949e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.99949e+08 )
									ret := 0.250000
		if( Positive_Money_Flow > 3.17882e+07 )
			if( rsi1 <= 28.244 )
				if( Negative_Money_Flow_Sum <= 1.4379e+08 )
					ret := 0.800000 // buy
				if( Negative_Money_Flow_Sum > 1.4379e+08 )
					if( Raw_Money_Flow <= 5.15206e+07 )
						if( MFI_High <= -66.8039 )
							if( Money_Flow_Ratio <= 0.13503 )
								ret := -0.400000
							if( Money_Flow_Ratio > 0.13503 )
								ret := 1.000000 // buy
						if( MFI_High > -66.8039 )
							if( Negative_Money_Flow_Sum <= 4.65798e+08 )
								if( Raw_Money_Flow <= 4.28998e+07 )
									ret := -0.616279
								if( Raw_Money_Flow > 4.28998e+07 )
									ret := -0.040000
							if( Negative_Money_Flow_Sum > 4.65798e+08 )
								if( MFI <= 26.0487 )
									ret := -0.905660 // sell
								if( MFI > 26.0487 )
									ret := -0.409091
					if( Raw_Money_Flow > 5.15206e+07 )
						if( smoothD_d <= 14.9249 )
							if( d_k <= -8.04699 )
								ret := 0.600000
							if( d_k > -8.04699 )
								if( smoothK_k <= 6.22239 )
									ret := -0.260870
								if( smoothK_k > 6.22239 )
									ret := -0.944444 // sell
						if( smoothD_d > 14.9249 )
							if( Typical_Price <= 159.892 )
								if( d_k <= 1.50414 )
									ret := -0.400000
								if( d_k > 1.50414 )
									ret := 0.800000 // buy
							if( Typical_Price > 159.892 )
								ret := 1.000000 // buy
			if( rsi1 > 28.244 )
				if( Positive_Money_Flow_Sum <= 2.43358e+08 )
					if( Negative_Money_Flow_Sum <= 3.39085e+08 )
						if( Negative_Money_Flow_Sum <= 2.28431e+08 )
							if( k <= 20.14 )
								if( d_k <= 0.394236 )
									ret := -0.833333 // sell
								if( d_k > 0.394236 )
									ret := 0.272727
							if( k > 20.14 )
								if( smoothD_d <= 49.4523 )
									ret := 0.904762 // buy
								if( smoothD_d > 49.4523 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 2.28431e+08 )
							if( Negative_Money_Flow_Sum <= 2.90961e+08 )
								if( Typical_Price <= 155.841 )
									ret := -0.888889 // sell
								if( Typical_Price > 155.841 )
									ret := -0.444444
							if( Negative_Money_Flow_Sum > 2.90961e+08 )
								if( Typical_Price <= 142.014 )
									ret := -1.000000 // sell
								if( Typical_Price > 142.014 )
									ret := -0.175000
					if( Negative_Money_Flow_Sum > 3.39085e+08 )
						if( Raw_Money_Flow <= 5.32149e+07 )
							if( d_k <= -9.70601 )
								if( rsi1 <= 31.8499 )
									ret := -0.550000
								if( rsi1 > 31.8499 )
									ret := 0.350000
							if( d_k > -9.70601 )
								if( smoothD_d <= 30.8615 )
									ret := 0.442857
								if( smoothD_d > 30.8615 )
									ret := 0.936170 // buy
						if( Raw_Money_Flow > 5.32149e+07 )
							if( Typical_Price <= 174.861 )
								if( MFI_High <= -51.138 )
									ret := -1.000000 // sell
								if( MFI_High > -51.138 )
									ret := -0.500000
							if( Typical_Price > 174.861 )
								ret := 0.250000
				if( Positive_Money_Flow_Sum > 2.43358e+08 )
					if( Negative_Money_Flow_Sum <= 6.22882e+08 )
						if( k <= 6.03071 )
							ret := 0.500000
						if( k > 6.03071 )
							if( Typical_Price <= 163.292 )
								if( rsi1 <= 31.8164 )
									ret := -0.333333
								if( rsi1 > 31.8164 )
									ret := -0.925000 // sell
							if( Typical_Price > 163.292 )
								if( Typical_Price <= 165.797 )
									ret := 0.214286
								if( Typical_Price > 165.797 )
									ret := -0.736842 // sell
					if( Negative_Money_Flow_Sum > 6.22882e+08 )
						if( Positive_Money_Flow <= 5.69341e+07 )
							if( Negative_Money_Flow_Sum <= 7.5528e+08 )
								ret := 0.200000
							if( Negative_Money_Flow_Sum > 7.5528e+08 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 5.69341e+07 )
							if( Negative_Money_Flow_Sum <= 7.53959e+08 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 7.53959e+08 )
								ret := 1.000000 // buy
	if( rsi1 > 36.2846 )
		if( Positive_Money_Flow_Sum <= 1.01653e+08 )
			if( Positive_Money_Flow_Sum <= 2.57994e+06 )
				if( MFI <= 17.7183 )
					if( rsi1 <= 50.1607 )
						if( Negative_Money_Flow_Sum <= 3.52773e+07 )
							if( Positive_Money_Flow <= 247121 )
								if( Positive_Money_Flow_Sum <= 1.80756e+06 )
									ret := -0.043636
								if( Positive_Money_Flow_Sum > 1.80756e+06 )
									ret := 0.216216
							if( Positive_Money_Flow > 247121 )
								if( Typical_Price <= 166.693 )
									ret := -0.426230
								if( Typical_Price > 166.693 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 3.52773e+07 )
							if( Negative_Money_Flow_Sum <= 3.71775e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 3.71775e+07 )
								if( k <= 45.3579 )
									ret := -0.054054
								if( k > 45.3579 )
									ret := 0.289855
					if( rsi1 > 50.1607 )
						if( Raw_Money_Flow <= 5.79247e+06 )
							if( Positive_Money_Flow_Sum <= 372305 )
								if( Negative_Money_Flow_Sum <= 2.44155e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.44155e+06 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 372305 )
								if( d <= 72.5548 )
									ret := -0.176056
								if( d > 72.5548 )
									ret := 0.043478
						if( Raw_Money_Flow > 5.79247e+06 )
							if( k <= 76.7293 )
								if( d <= 19.6647 )
									ret := -0.500000
								if( d > 19.6647 )
									ret := -0.971429 // sell
							if( k > 76.7293 )
								if( Typical_Price <= 171.161 )
									ret := 0.166667
								if( Typical_Price > 171.161 )
									ret := -1.000000 // sell
				if( MFI > 17.7183 )
					if( Positive_Money_Flow_Sum <= 1.95299e+06 )
						if( Money_Flow_Ratio <= 1.30127 )
							if( Money_Flow_Ratio <= 0.683558 )
								if( Positive_Money_Flow_Sum <= 949650 )
									ret := 0.064873
								if( Positive_Money_Flow_Sum > 949650 )
									ret := -0.042152
							if( Money_Flow_Ratio > 0.683558 )
								if( Raw_Money_Flow <= 235333 )
									ret := 0.092271
								if( Raw_Money_Flow > 235333 )
									ret := 0.205674
						if( Money_Flow_Ratio > 1.30127 )
							if( Typical_Price <= 133.896 )
								if( MFI <= 81.0778 )
									ret := -0.206897
								if( MFI > 81.0778 )
									ret := -1.000000 // sell
							if( Typical_Price > 133.896 )
								if( smoothD_d <= 59.5561 )
									ret := -0.041749
								if( smoothD_d > 59.5561 )
									ret := 0.064704
					if( Positive_Money_Flow_Sum > 1.95299e+06 )
						if( Negative_Money_Flow_Sum <= 3.33516e+06 )
							if( Raw_Money_Flow <= 348122 )
								if( Positive_Money_Flow_Sum <= 2.40131e+06 )
									ret := 0.078685
								if( Positive_Money_Flow_Sum > 2.40131e+06 )
									ret := -0.080074
							if( Raw_Money_Flow > 348122 )
								if( k <= 63.012 )
									ret := 0.071264
								if( k > 63.012 )
									ret := 0.283105
						if( Negative_Money_Flow_Sum > 3.33516e+06 )
							if( Negative_Money_Flow_Sum <= 3.9879e+06 )
								if( rsi1 <= 58.5598 )
									ret := 0.357466
								if( rsi1 > 58.5598 )
									ret := 0.787611 // buy
							if( Negative_Money_Flow_Sum > 3.9879e+06 )
								if( k <= 57.7335 )
									ret := 0.270349
								if( k > 57.7335 )
									ret := 0.013453
			if( Positive_Money_Flow_Sum > 2.57994e+06 )
				if( d_k <= -1.9808 )
					if( Negative_Money_Flow_Sum <= 7.58111e+07 )
						if( Negative_Money_Flow_Sum <= 1.47932e+07 )
							if( rsi1 <= 81.5475 )
								if( MFI_High <= -52.3708 )
									ret := -0.356643
								if( MFI_High > -52.3708 )
									ret := -0.034987
							if( rsi1 > 81.5475 )
								if( Negative_Money_Flow_Sum <= 267653 )
									ret := 0.625000
								if( Negative_Money_Flow_Sum > 267653 )
									ret := -0.363636
						if( Negative_Money_Flow_Sum > 1.47932e+07 )
							if( Negative_Money_Flow_Sum <= 4.38607e+07 )
								if( Raw_Money_Flow <= 1.62651e+07 )
									ret := 0.120364
								if( Raw_Money_Flow > 1.62651e+07 )
									ret := -0.363636
							if( Negative_Money_Flow_Sum > 4.38607e+07 )
								if( k <= 94.4346 )
									ret := -0.020917
								if( k > 94.4346 )
									ret := -0.242236
					if( Negative_Money_Flow_Sum > 7.58111e+07 )
						if( Negative_Money_Flow_Sum <= 1.34937e+08 )
							if( MFI_High <= -46.4092 )
								if( Positive_Money_Flow_Sum <= 4.33802e+07 )
									ret := -0.164444
								if( Positive_Money_Flow_Sum > 4.33802e+07 )
									ret := 0.314917
							if( MFI_High > -46.4092 )
								if( MFI <= 47.1826 )
									ret := -0.240000
								if( MFI > 47.1826 )
									ret := -0.080808
						if( Negative_Money_Flow_Sum > 1.34937e+08 )
							if( rsi1 <= 57.1398 )
								if( Negative_Money_Flow_Sum <= 3.76036e+08 )
									ret := 0.184840
								if( Negative_Money_Flow_Sum > 3.76036e+08 )
									ret := -0.359375
							if( rsi1 > 57.1398 )
								if( d_k <= -7.33893 )
									ret := -0.846154 // sell
								if( d_k > -7.33893 )
									ret := 0.000000
				if( d_k > -1.9808 )
					if( k <= 45.6809 )
						if( MFI <= 34.2835 )
							if( Negative_Money_Flow_Sum <= 1.3114e+07 )
								if( Negative_Money_Flow <= 727485 )
									ret := -0.007634
								if( Negative_Money_Flow > 727485 )
									ret := 0.729730 // buy
							if( Negative_Money_Flow_Sum > 1.3114e+07 )
								if( Positive_Money_Flow_Sum <= 2.58989e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.58989e+06 )
									ret := -0.096397
						if( MFI > 34.2835 )
							if( Typical_Price <= 152.502 )
								if( Positive_Money_Flow_Sum <= 2.26099e+07 )
									ret := 0.254782
								if( Positive_Money_Flow_Sum > 2.26099e+07 )
									ret := 0.120892
							if( Typical_Price > 152.502 )
								if( Raw_Money_Flow <= 1.26998e+07 )
									ret := 0.039256
								if( Raw_Money_Flow > 1.26998e+07 )
									ret := 0.189153
					if( k > 45.6809 )
						if( Typical_Price <= 162.556 )
							if( Positive_Money_Flow <= 8.75536e+06 )
								if( Typical_Price <= 141.416 )
									ret := -0.101579
								if( Typical_Price > 141.416 )
									ret := -0.016041
							if( Positive_Money_Flow > 8.75536e+06 )
								if( MFI_High <= -47.1472 )
									ret := 0.700000 // buy
								if( MFI_High > -47.1472 )
									ret := 0.070806
						if( Typical_Price > 162.556 )
							if( MFI_Low <= 12.3702 )
								if( d_k <= 6.39693 )
									ret := -0.296296
								if( d_k > 6.39693 )
									ret := 0.109375
							if( MFI_Low > 12.3702 )
								if( Raw_Money_Flow <= 9.52279e+06 )
									ret := 0.068794
								if( Raw_Money_Flow > 9.52279e+06 )
									ret := 0.238971
		if( Positive_Money_Flow_Sum > 1.01653e+08 )
			if( MFI <= 56.4915 )
				if( Positive_Money_Flow_Sum <= 5.35384e+08 )
					if( rsi1 <= 51.6788 )
						if( Negative_Money_Flow_Sum <= 1.45132e+08 )
							if( Raw_Money_Flow <= 2.12564e+07 )
								if( MFI_High <= -24.3468 )
									ret := 0.268325
								if( MFI_High > -24.3468 )
									ret := -0.135802
							if( Raw_Money_Flow > 2.12564e+07 )
								if( Positive_Money_Flow_Sum <= 1.3815e+08 )
									ret := -0.204545
								if( Positive_Money_Flow_Sum > 1.3815e+08 )
									ret := 0.277228
						if( Negative_Money_Flow_Sum > 1.45132e+08 )
							if( MFI_High <= -37.0718 )
								if( Negative_Money_Flow_Sum <= 1.73814e+08 )
									ret := -0.201389
								if( Negative_Money_Flow_Sum > 1.73814e+08 )
									ret := 0.127894
							if( MFI_High > -37.0718 )
								if( Negative_Money_Flow_Sum <= 3.10526e+08 )
									ret := -0.005020
								if( Negative_Money_Flow_Sum > 3.10526e+08 )
									ret := -0.276543
					if( rsi1 > 51.6788 )
						if( Typical_Price <= 132.312 )
							if( Raw_Money_Flow <= 3.35599e+07 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 3.35599e+07 )
								ret := 0.500000
						if( Typical_Price > 132.312 )
							if( Typical_Price <= 159.137 )
								if( Positive_Money_Flow_Sum <= 3.19074e+08 )
									ret := -0.140810
								if( Positive_Money_Flow_Sum > 3.19074e+08 )
									ret := 0.317073
							if( Typical_Price > 159.137 )
								if( Positive_Money_Flow_Sum <= 1.92066e+08 )
									ret := 0.068822
								if( Positive_Money_Flow_Sum > 1.92066e+08 )
									ret := -0.168033
				if( Positive_Money_Flow_Sum > 5.35384e+08 )
					if( MFI_High <= -24.8768 )
						if( Positive_Money_Flow_Sum <= 7.34437e+08 )
							if( Typical_Price <= 186.465 )
								if( rsi1 <= 45.7483 )
									ret := -0.789474 // sell
								if( rsi1 > 45.7483 )
									ret := -1.000000 // sell
							if( Typical_Price > 186.465 )
								ret := -0.500000
						if( Positive_Money_Flow_Sum > 7.34437e+08 )
							ret := -0.250000
					if( MFI_High > -24.8768 )
						ret := 0.166667
			if( MFI > 56.4915 )
				if( Negative_Money_Flow_Sum <= 4.43018e+08 )
					if( Typical_Price <= 133.076 )
						if( Raw_Money_Flow <= 1.04169e+07 )
							if( Negative_Money_Flow_Sum <= 4.5593e+07 )
								ret := 0.333333
							if( Negative_Money_Flow_Sum > 4.5593e+07 )
								if( Positive_Money_Flow_Sum <= 1.28702e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.28702e+08 )
									ret := 0.000000
						if( Raw_Money_Flow > 1.04169e+07 )
							if( rsi1 <= 76.9317 )
								if( MFI <= 71.0735 )
									ret := 0.385417
								if( MFI > 71.0735 )
									ret := 0.776316 // buy
							if( rsi1 > 76.9317 )
								if( d <= 78.6667 )
									ret := -0.666667
								if( d > 78.6667 )
									ret := 0.214286
					if( Typical_Price > 133.076 )
						if( Negative_Money_Flow_Sum <= 4.17787e+07 )
							if( Money_Flow_Ratio <= 9.09029 )
								if( Positive_Money_Flow <= 3.38877e+07 )
									ret := 0.244444
								if( Positive_Money_Flow > 3.38877e+07 )
									ret := -0.410714
							if( Money_Flow_Ratio > 9.09029 )
								if( Positive_Money_Flow <= 2.96573e+07 )
									ret := -0.064833
								if( Positive_Money_Flow > 2.96573e+07 )
									ret := 0.168285
						if( Negative_Money_Flow_Sum > 4.17787e+07 )
							if( Money_Flow_Ratio <= 1.96829 )
								if( Positive_Money_Flow_Sum <= 3.6243e+08 )
									ret := 0.103151
								if( Positive_Money_Flow_Sum > 3.6243e+08 )
									ret := 0.345679
							if( Money_Flow_Ratio > 1.96829 )
								if( Negative_Money_Flow <= 9.51646e+07 )
									ret := 0.021528
								if( Negative_Money_Flow > 9.51646e+07 )
									ret := 0.875000 // buy
				if( Negative_Money_Flow_Sum > 4.43018e+08 )
					if( smoothD_d <= 17.9602 )
						if( Typical_Price <= 175.616 )
							if( Typical_Price <= 163.515 )
								ret := -0.750000 // sell
							if( Typical_Price > 163.515 )
								ret := -1.000000 // sell
						if( Typical_Price > 175.616 )
							if( d_k <= -1.13472 )
								ret := -0.500000
							if( d_k > -1.13472 )
								if( MFI_High <= -21.6261 )
									ret := 0.750000 // buy
								if( MFI_High > -21.6261 )
									ret := 1.000000 // buy
					if( smoothD_d > 17.9602 )
						if( Typical_Price <= 185.136 )
							if( Typical_Price <= 153.415 )
								ret := 0.571429
							if( Typical_Price > 153.415 )
								if( smoothD_d <= 24.2197 )
									ret := 0.800000 // buy
								if( smoothD_d > 24.2197 )
									ret := 1.000000 // buy
						if( Typical_Price > 185.136 )
							ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_AMD_1Min_d910dacc(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


